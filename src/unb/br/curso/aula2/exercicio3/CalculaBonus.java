package unb.br.curso.aula2.exercicio3;

public class CalculaBonus {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Joao", 1000, "STI");
		double bonusGerente = gerente.calcularBonusSalarial();
		System.out.println("Bonus do Gerente: " + bonusGerente);
		System.out.println("Salario total: " + (gerente.getSalario() + bonusGerente));
	}

}