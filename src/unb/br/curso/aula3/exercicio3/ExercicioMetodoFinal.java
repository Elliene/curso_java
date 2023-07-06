package unb.br.curso.aula3.exercicio3;

/*O modificador "final" definido no m�todo exibirInformacoes() na classe forma n�o permite a sobrescrita do metodo
 *   na classe filha "Retangulo". Para corrigir foi necessario retirar o modificador "final" da classe.  */

public class ExercicioMetodoFinal {
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(5, 10);
		retangulo.exibirInformacoes();
		retangulo.calcularArea();
	}
}

class Forma {
	public void exibirInformacoes() {
		System.out.println("Esta � uma forma geom�trica.");
	}
}

class Retangulo extends Forma {
	private int largura;
	private int altura;

	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public void exibirInformacoes() {
		System.out.println("Este � um ret�ngulo com largura " + largura + " e altura " + altura + ".");
	}

	public void calcularArea() {
		int area = largura * altura;
		System.out.println("A �rea do ret�ngulo �: " + area);
	}
}