package unb.br.curso.aula4.exercicio4;

public class Triangulo implements Figura {
	double base, altura, lado;

	public Triangulo() {

	}

	public Triangulo(double base, double altura, double lado) {
		super();
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (base * altura) / 2;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return lado + lado + lado;
	}

}
