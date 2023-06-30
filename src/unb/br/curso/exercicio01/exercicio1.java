package unb.br.curso.exercicio01;
import java.util.Scanner;

public class exercicio1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N, soma, i;
		N = sc.nextInt();
		soma = 0;
		for (i = 1; i < N; i++) {
			if (i % 2 == 0) {
				soma = soma + i;
			} 
		}
		System.out.println("soma = " + soma);
		sc.close();

	}

}
