package aula7calculadoraarmazenamento;

import java.util.List;


import aula7calculadoraframework.Divisao;
import aula7calculadoraframework.Expo;
import aula7calculadoraframework.Multiplicacao;
import aula7calculadoraframework.Nodo;
import aula7calculadoraframework.Operacao;
import aula7calculadoraframework.Percent;
import aula7calculadoraframework.Soma;
import aula7calculadoraframework.Subtracao;
import aula7calculadoraframework.Valor;
import unb.br.curso.aula8.exercicio1.CalculadoraSimpleFatory;
import unb.br.curso.aula8.exercicio2.ArmazenamentoMeuBanco;

public class Main {
	public static void main(String[] args) throws Exception {
		//Armazenamento armazenamento = new ArmazenamentoArquivo();
		//Armazenamento armazenamento = new ArmazenamentoH2();
		//Armazenamento armazenamento = new ArmazenamentoMeuBanco();
		Armazenamento armazenamento = CalculadoraSimpleFatory.createArmazenamento(CalculadoraSimpleFatory.ARQ);
		
		// Expres�es a serem armazenadas
		String expressao1 = "(5 + (10 / 2))";
		String expressao2 = "(3 * (8 + 2))";

		// ID das express�es
		String id1 = "expressao1";
		String id2 = "expressao2";

		// Removendo espa�os em branco
		String semEspacos1 = expressao1.replaceAll("\\s+", "");
		String semEspacos2 = expressao2.replaceAll("\\s+", "");

		// Criando as opera��es
		Nodo operacao1 = criarOperacao(semEspacos1);
		Nodo operacao2 = criarOperacao(semEspacos2);

		// Executando as opera��es e obtendo os resultados
		int resultado1 = operacao1.calcula();
		int resultado2 = operacao2.calcula();

		// Salvando as express�es, opera��es e resultados
		armazenamento.salvarExpressao(id1, expressao1);
		armazenamento.salvarOperacao(id1, operacao1);
		armazenamento.salvarResultado(id1, resultado1);

		armazenamento.salvarExpressao(id2, expressao2);
		armazenamento.salvarOperacao(id2, operacao2);
		armazenamento.salvarResultado(id2, resultado2);

		// Recuperando uma express��o, opera��o e resultado pelo ID
		String expressaoRecuperada = armazenamento.recuperarExpressao(id1);
		Operacao operacaoRecuperada = armazenamento.recuperarOperacao(id1);
		int resultadoRecuperado = armazenamento.recuperarResultado(id1);

		System.out.println("Expressao recuperada: " + expressaoRecuperada);
		System.out.println("Opera��o recuperada: " + operacaoRecuperada);
		System.out.println("Resultado recuperado: " + resultadoRecuperado);

		// Listando todas as expressões
		List<String> expressoes = armazenamento.listarExpressoes();
		System.out.println("Express�es armazenadas:");
		for (String id : expressoes) {
			System.out.println("- ID: " + id);
			System.out.println("  Expressao: " + armazenamento.recuperarExpressao(id));
			System.out.println("  Operacao: " + armazenamento.recuperarOperacao(id));
			System.out.println("  Resultado: " + armazenamento.recuperarResultado(id));
		}
	}

	// M�todo recursivo para criar os objetos de opera��o a partir da express�o
	private static Nodo criarOperacao(String expressao) {
		// Verificando se � um valor num�rico
		try {
			int valor = Integer.parseInt(expressao);
			return new Valor(valor);
		} catch (NumberFormatException e) {
			// N�o um valor num�rico, trata-se de uma opera��o
			int nivelParenteses = 0;
			int indexOperador = -1;

			// Percorrendo a express�o para encontrar o operador de maior n�vel de
			// parenteses
			for (int i = 0; i < expressao.length(); i++) {
				char caractere = expressao.charAt(i);
				if (caractere == '(') {
					nivelParenteses++;
				} else if (caractere == ')') {
					nivelParenteses--;
				} else if (nivelParenteses == 1
						&& (caractere == '+' || caractere == '-' || caractere == '*' || caractere == '/' || caractere == '^')) {
					indexOperador = i;
				}
			}

			if (indexOperador != -1) {
				// Separando a express�oo nos operandos e operador
				String operador = expressao.substring(indexOperador, indexOperador + 1);
				String operando1 = expressao.substring(1, indexOperador);
				String operando2 = expressao.substring(indexOperador + 1, expressao.length() - 1);

				// Chamando recursivamente o m�todo para criar as operações dos operandos
				Nodo op1 = criarOperacao(operando1);
				Nodo op2 = criarOperacao(operando2);

				// Criando a opera��o com base no operador encontrado
				switch (operador) {
				case "+":
					return new Soma(op1, op2);
				case "-":
					return new Subtracao(op1, op2);
					//throw new UnsupportedOperationException("Operador '-' n�o suportado.");
				case "*":
					// Implemente a classe Multiplicacao caso necessario
					return new Multiplicacao(op1, op2);
				case "/":
					return new Divisao(op1, op2);
				case "^":
					return new Expo(op1, op2);
				case "%":
					return new Percent(op1, op2);
				
				default:
					throw new IllegalArgumentException("Operador inv�lido.");
				}
			} else {
				throw new IllegalArgumentException("Express��o inv�lida.");
			}
		}
	}
}
