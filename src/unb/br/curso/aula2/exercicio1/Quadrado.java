package unb.br.curso.aula2.exercicio1;



public class Quadrado extends Forma {
	private double base;
    //Classe criada para testar o comportamento da Herança.
	//Construtor: método usado para inicializar os atributos da classe
	public Quadrado(double base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base * base;
	}
	
	@Override
	public double calcularPerimetro() {
		return 4*base;
	}

	
}