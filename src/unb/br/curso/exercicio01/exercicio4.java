package unb.br.curso.exercicio01;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o email:");
		String email = sc.nextLine().trim().replaceAll("\\s+", ""), dominio;
		// emailFormatado= email.trim().replaceAll("\\s+","");
		int posicaoArroba;
		posicaoArroba = email.indexOf("@");
		dominio = email.substring(posicaoArroba + 1);
		System.out.println("O dominio do email informado é: " + dominio);
		sc.close();
	}

}