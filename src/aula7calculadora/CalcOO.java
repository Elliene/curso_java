package aula7calculadora;
import java.util.Scanner;

import aula7calculadoraframework.Divisao;
import aula7calculadoraframework.Expo;
import aula7calculadoraframework.Multiplicacao;
import aula7calculadoraframework.Nodo;
import aula7calculadoraframework.Percent;
import aula7calculadoraframework.Soma;
import aula7calculadoraframework.Subtracao;
import aula7calculadoraframework.Valor;

public class CalcOO {

	public static void main(String args[]) {
		// criando um objeto c a apartir do metodo calc
        
		// declarando as varÃ­aveis
		Nodo resultado = new Valor(0);
		int opcao = 5;
		int num1;
		int num2;
		Scanner input = new Scanner(System.in);
		System.out.println("- Escolha uma operação -");
		System.out.println("1. Soma");
		System.out.println("2. Subtracao");
		System.out.println("3. Multiplicacao");
		System.out.println("4. Divisao");
		System.out.println("5. Expo");
		System.out.println("6. Percent");
		System.out.println("0. Sair");
		System.out.println("Operacao: ");
		opcao = input.nextInt();
		while (opcao != 0) {
			Scanner input1 = new Scanner(System.in);
			System.out.println("Qual o primeiro numero: ");
			num1 = input1.nextInt();
			Nodo esquerda = new Valor(num1);
			System.out.println("Qual o segundo numero: ");
			num2 = input1.nextInt();
			Nodo direita = new Valor(num2);
			if (opcao == 1) {
				resultado = new Soma(esquerda, direita);
				System.out.print("\nO resultado da soma é: ");
				break;
			} else if (opcao == 2) {
				resultado = new Subtracao(esquerda, direita);
				System.out.print("\nO resultado da subtração é: ");
				break;
			} else if (opcao == 3) {
				resultado = new Multiplicacao(esquerda, direita);
				System.out.print("\nO resultado da multiplicacao é:" );
				break;
			} else if (opcao == 4) {
				resultado = new Divisao(esquerda, direita);
				System.out.printf("\nO resultado da divisão é:");
				break;
			} else if (opcao == 5) {
				resultado = new Expo(esquerda, direita);
				System.out.printf("\nO resultado da exponeciação é:");
				break;
			} else if (opcao == 6) {
				resultado = new Percent(esquerda, direita);
				System.out.printf("\nO resultado da porcentagem "+ esquerda +" por "+ direita+":");
				break;
			} else {
				System.out.println("????");
				break;
			}
		
		}// fim do while - usuario optou por sair
		System.out.println( resultado.calcula());
	} // fim do metodo principal
}