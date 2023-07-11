package unb.br.curso.aula4.exercicio4;

public class Quadrado implements Figura {

	double base;

	public Quadrado() {

	}

	public Quadrado(double base) {
		super();
		this.base = base;
	}

	@Override
	public double calcularArea() {
		return base * base;

	}

	@Override
	public double calcularPerimetro() {
		return 4 * base;

	}

}
