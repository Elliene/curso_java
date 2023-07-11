package unb.br.curso.aula4.exercicio4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c = new Circulo(2);
		System.out.println("a area circulo é: " + c.calcularArea() + " e o perimetro:" + c.calcularPerimetro());
		Quadrado q = new Quadrado(3);

		System.out.println("a area quadrado é: " + q.calcularArea() + " e o perimetro:" + q.calcularPerimetro());

		Triangulo t = new Triangulo(3, 6, 3);
		System.out.println("a area triangulo é: " + t.calcularArea() + " e o perimetro:" + t.calcularPerimetro());
	}

}
