package unb.br.curso.aula1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String entrada =sc.nextLine();
		String stringNormal = entrada.toLowerCase().trim().replaceAll("\\s+", "");
		String stringInvertida = "";
		int i;
		for(i = stringNormal.length() -1 ; i >= 0; i--)
		{
			stringInvertida += stringNormal.charAt(i);
		}
		System.out.println(stringInvertida);
		if(stringInvertida.equals(stringNormal)) {
			System.out.print("A palavra ou frase '"+ entrada +"' é um palíndromo");
		}
		else {
			System.out.print("A palavra ou frase '"+ entrada +"' nao é um palíndromo");
			
		}
		sc.close();
	}

}
