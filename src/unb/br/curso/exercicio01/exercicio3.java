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
		System.out.println("Adivinhe o n�mero que foi gerado!");
		numero = sc.nextInt();
		// System.out.println(numGerado);
		while (numero != numGerado) {
			if (numero > numGerado) {
				System.out.println("o n�mero informado � maior que o  n�mero gerado ");
			} else if (numero < numGerado) {
				System.out.println("o n�mero informado � menor que o n�mero gerado ");
			}
			numTentativas++;
			System.out.println("Tente outra vez");
			numero = sc.nextInt();
		}
		System.out.println("Parab�ns,  o n�mero informado � igual n�mero gerado ");
		System.out.println("Numero de tentativas"+numTentativas);

	}

}
