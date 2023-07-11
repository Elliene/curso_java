package unb.br.curso.aula4.exercicio2;

class WAVPlayer implements FormatoAudio {
	private String arquivo;

	@Override
	public void abrir(String arquivo) {
		// TODO Auto-generated method stub
		System.out.println("Abrir o arquivo WAV: " + arquivo);
		this.arquivo = arquivo;
	}

	@Override
	public void reproduzir() {
		// TODO Auto-generated method stub
		if (arquivo != null) {
			System.out.println("Reproduzir o arquivo WAV: " + arquivo);
		} else {
			System.out.println("Nenhum arquivo WAV aberto.");
		}
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Pausar a reprodução do arquivo WAV.");
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stubv
		System.out.println("Parar a reprodução do arquivo WAV.");
		arquivo = null;
	}
}


