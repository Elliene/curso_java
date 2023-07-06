package unb.br.curso.aula3.exercicio4;

/*Antes da chamada do m�todo: a = 10, b = 20
 *Dentro do m�todo: x = 15, y = 40
 *Ap�s a chamada do m�todo: a = 10, b = 20
 * 
 ****Explica��o 
 *
 *Variavel "a" recebe o valor 10 e "b" o valor 20. Ao chamar o m�todo alterarValores
 *os sistema passa os valores para de a e b para x e y e executa as opera�es de x=x+5 e y=y*2
 *imprimindo os valores: x=15 e y=40.
 *Retorna para classe principal e imprime os valores a=10 e B=20 pois n�o foram modificados ja que o 
 *metodo alterarValores(int x, int y) modifica somente as variaveis locais e n�o afeta os valores das variaveis da classe principal.
 */
public class ExercicioPassagemParametros {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("Antes da chamada do m�todo: a = " + a + ", b = " + b);
		alterarValores(a, b);
		System.out.println("Ap�s a chamada do m�todo: a = " + a + ", b = " + b);
	}

	public static void alterarValores(int x, int y) {
		x += 5;
		y *= 2;
		System.out.println("Dentro do m�todo: x = " + x + ", y = " + y);
	}
}