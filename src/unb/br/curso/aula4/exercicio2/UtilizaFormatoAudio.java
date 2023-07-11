package unb.br.curso.aula4.exercicio2;

public class UtilizaFormatoAudio {

	public static void main(String[] args) {
		MPPlayer mp3Player = new MPPlayer();
		mp3Player.abrir("musica.mp3");
		mp3Player.reproduzir();
		mp3Player.pausar();
		mp3Player.parar();

		WAVPlayer wavPlayer = new WAVPlayer();
		wavPlayer.abrir("som.wav");
		wavPlayer.reproduzir();
		wavPlayer.pausar();
		wavPlayer.parar();
	}

}
