package unb.br.curso.aula2.exercicio1;

public class CalcularAreas {
	
	public static void main(String[] args) {
		Forma c = new Circulo(4.5);
		System.out.println(c.calcularArea());
		Forma q = new Quadrado(4.5);
		System.out.println(q.calcularArea());
	}
}
