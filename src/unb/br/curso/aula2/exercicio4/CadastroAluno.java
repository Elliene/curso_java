package unb.br.curso.aula2.exercicio4;

public class CadastroAluno extends Aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a = new Aluno("Maria", "100123", "Computação");
		Aluno b = new Aluno("Jose", "100456", "Segurança Publica");
		a.exibirInformacoes();
		b.exibirInformacoes();
	}
}