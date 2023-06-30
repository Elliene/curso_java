package unb.br.curso.exercicio01;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N, M, soma, i;
		M = sc.nextInt();
		N = sc.nextInt();
		soma = 0;
		for (i = M; i < N; i++) {
			if (i % 2 == 0) {
				soma = soma + i;
			}
		}
		System.out.println("soma = " + soma);
		sc.close();
	}

}
