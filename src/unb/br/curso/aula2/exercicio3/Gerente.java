package unb.br.curso.aula2.exercicio3;

public class Gerente extends Funcionario {

	private String departamento;

	public Gerente(String nome, double salario, String dpto) {
		super(nome, salario);// new Funcionario(nome, salario)
		this.departamento = dpto;
	}

	public double calcularBonusSalarial() {
		return getSalario() * 0.10;
	}

}
