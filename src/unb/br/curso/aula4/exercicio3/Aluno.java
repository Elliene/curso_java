package unb.br.curso.aula4.exercicio3;

public class Aluno extends ObjetoComparavel {
	private String nome;
	private int idade;

	public Aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public int comparar(Comparavel c) {
		// TODO Auto-generated method stub
		if (c instanceof Aluno) {
			Aluno outroAluno = (Aluno) c;
			return this.idade = outroAluno.idade;
		}
		return 0;

	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + "]";
	}

}
