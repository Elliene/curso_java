package unb.br.curso.aula4.exercicio4;

public class Circulo implements Figura {

	double raio;

	public Circulo() {

	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * raio * raio;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * raio;
	}

}
