package unb.br.curso.aula2.exercicio4;

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aluno(String nome, String matricula, String curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}
	
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getMatricula());
        System.out.println("Matrícula: " + getCurso());
    }
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
