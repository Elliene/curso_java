package unb.br.curso.aula3.exercicio5;

/*Antes da chamada do m�todo: 1 2 3 4 5 
 *Dentro do m�todo: 10 20 30 40 50 
 *Ap�s a chamada do m�todo: 1 2 3 4 5 
 *
 ****Explica��o
 *
 *Cria o array de 4 posi��es ((0-3)) com os os valores dos objetos {1, 2, 3, 4, 5}. 
 *Imprime os valores dos objetos utilizando o loop FOR. 
 *Chama o m�todo  modificaArray(int[] arr) passando o array como parametro. 
 *cria uma nova instancia do arr com novos objetos e imprime os novos valores do array.
 *Retorna para classe principal e imprime o array com os valores atuais pois n�o foram modificados ja que o m�todo modificaArray(int[] arr) modifica 
 *somente as variaveis locais e n�o afeta os valores das variaveis da classe principal.
*/
public class ExercicioPassagemParametros {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		System.out.println("Antes da chamada do m�todo: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		modificarArray(array);
		System.out.println("\nAp�s a chamada do m�todo: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void modificarArray(int[] arr) {
		arr = new int[] { 10, 20, 30, 40, 50 };
		System.out.println("\nDentro do m�todo: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}