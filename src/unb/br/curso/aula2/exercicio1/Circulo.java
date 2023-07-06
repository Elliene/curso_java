package unb.br.curso.aula2.exercicio1;


public class Circulo extends Forma {
	private double raio;
   
	//Construtor: metodo usado para inicializar os atributos da classe
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * raio * raio;
	}
	
	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * raio;
	}

	
}
