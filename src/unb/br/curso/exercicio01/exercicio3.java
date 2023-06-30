package unb.br.curso.exercicio01;

import java.util.Scanner;
import java.util.Random;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numero, numGerado, numTentativas;
		numTentativas = 1;
		Random gerador = new Random();
		numGerado = gerador.nextInt(100)+1;
		System.out.println("Adivinhe o número que foi gerado!");
		numero = sc.nextInt();
		// System.out.println(numGerado);
		while (numero != numGerado) {
			if (numero > numGerado) {
				System.out.println("o número informado é maior que o  número gerado ");
			} else if (numero < numGerado) {
				System.out.println("o número informado é menor que o número gerado ");
			}
			numTentativas++;
			System.out.println("Tente outra vez");
			numero = sc.nextInt();
		}
		System.out.println("Parabéns,  o número informado é igual número gerado ");
		System.out.println("Numero de tentativas"+numTentativas);

	}

}
