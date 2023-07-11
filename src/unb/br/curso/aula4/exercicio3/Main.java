package unb.br.curso.aula4.exercicio3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno[] alunos = new Aluno[10];
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = new Aluno("aluno -" + i, 10 + i);
		}
		System.out.println(Arrays.toString(alunos));

		Main main = new Main();
		Aluno alunoMaisVelho = main.maxIdade(alunos);
		Aluno alunoMaisNovo = main.minIdade(alunos);
		System.out.println("Aluno mais velho: " + alunoMaisVelho);
		System.out.println("Aluno mais novo: " + alunoMaisNovo);

	}

	public Aluno maxIdade(Aluno[] alunos) {
		Aluno alunoMaisVelho = alunos[0];
		for (int i = 1; i < alunos.length; i++) {
			if (alunos[i].comparar(alunoMaisVelho) > 0) {
				alunoMaisVelho = alunos[i];
			}
		}
		return alunoMaisVelho;
	}

	public Aluno minIdade(Aluno[] alunos) {
		Aluno alunoMaisNovo = alunos[0];
		for (int i = 1; i < alunos.length; i++) {
			if (alunos[i].comparar(alunoMaisNovo) < 0) {
				alunoMaisNovo = alunos[i];
			}
		}
		return alunoMaisNovo;
	}
}







