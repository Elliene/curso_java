package unb.br.curso.aula3.exercicio1;

public class Veiculo {

	public int velocidadeMaxima;

	public Veiculo(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void acelerar(int velocidadeVeiculo) {
		velocidadeMaxima = getVelocidadeMaxima();
		if (velocidadeVeiculo == velocidadeMaxima) {
			System.out.println("voc� chegou na velocidade maxima de " + velocidadeMaxima + "KM/h");
		} else if (velocidadeVeiculo > velocidadeMaxima) {
			System.out.println("voc� ultrapassou a  velocidade maxima de " + velocidadeMaxima + "KM/h");
		} else if (velocidadeVeiculo < velocidadeMaxima) {
			System.out.println("voc� esta abaixo da velocidade maxima de " + velocidadeMaxima + "KM/h");
		}
	}

}
