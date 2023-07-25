package unb.br.curso.aula8.exercicio2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import aula7calculadoraarmazenamento.Armazenamento;
import aula7calculadoraframework.Nodo;
import aula7calculadoraframework.Operacao;


// Implementaçãoo do armazenamento em banco de dados Postgree
public class ArmazenamentoMeuBanco implements Armazenamento {
    private Connection connection;

    public ArmazenamentoMeuBanco() {
        try {
            // Carrega o driver postgres  e cria a conexÃ£o com o banco de dados
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "eunawi34");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void salvarExpressao(String id, String expressao) {
    	try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO expressoes (id, expressao) VALUES (?, ?)"))
    	{
    		preparedStatement.setString(1,id);
    		preparedStatement.setString(2, expressao);
    		preparedStatement.executeUpdate();
    	} catch (SQLException e) {
            e.printStackTrace();
        }
       
    }

    @Override
    public void salvarOperacao(String id, Nodo operacao) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO operacoes (id, operacao) VALUES (?, ?)")) {
            preparedStatement.setString(1, id);
            preparedStatement.setObject(2, operacao, Types.OTHER);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void salvarResultado(String id, int resultado) {
    	   try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO resultados (id, resultado) VALUES (?, ?)")) {
               preparedStatement.setString(1, id);
               preparedStatement.setObject(2, resultado, Types.OTHER);
               preparedStatement.executeUpdate();
           } catch (SQLException e) {
               e.printStackTrace();
           }
    }

    @Override
    public String recuperarExpressao(String id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT expressao FROM expressoes WHERE id = ?")) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
            	return  resultSet.getString("expressao"); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Operacao recuperarOperacao(String id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT operacao FROM operacoes WHERE id = ?")) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
            	return  (Operacao) resultSet.getObject("operacao"); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int recuperarResultado(String id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT resultado FROM resultados WHERE id = ?")) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
            	return  resultSet.getInt("resultado"); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<String> listarExpressoes() {
    	List<String> expressoes = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT id FROM expressoes WHERE id = ?")) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
            	expressoes.add(resultSet.getString("id")); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

