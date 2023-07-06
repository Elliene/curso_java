package unb.br.curso.aula3.exercicio5;

/*Antes da chamada do método: 1 2 3 4 5 
 *Dentro do método: 10 20 30 40 50 
 *Após a chamada do método: 1 2 3 4 5 
 *
 ****Explicação
 *
 *Cria o array de 4 posições ((0-3)) com os os valores dos objetos {1, 2, 3, 4, 5}. 
 *Imprime os valores dos objetos utilizando o loop FOR. 
 *Chama o método  modificaArray(int[] arr) passando o array como parametro. 
 *cria uma nova instancia do arr com novos objetos e imprime os novos valores do array.
 *Retorna para classe principal e imprime o array com os valores atuais pois não foram modificados ja que o método modificaArray(int[] arr) modifica 
 *somente as variaveis locais e não afeta os valores das variaveis da classe principal.
*/
public class ExercicioPassagemParametros {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		System.out.println("Antes da chamada do método: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		modificarArray(array);
		System.out.println("\nApós a chamada do método: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void modificarArray(int[] arr) {
		arr = new int[] { 10, 20, 30, 40, 50 };
		System.out.println("\nDentro do método: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}