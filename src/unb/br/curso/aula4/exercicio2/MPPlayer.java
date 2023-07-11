package unb.br.curso.aula4.exercicio2;

class MPPlayer implements FormatoAudio {
    private String arquivo;

	@Override
	public void abrir(String arquivo) {
		// TODO Auto-generated method stub
		System.out.println("Abrir o arquivo MP3: " + arquivo);
		this.arquivo = arquivo;
	}

	@Override
	public void reproduzir() {
		// TODO Auto-generated method stub
		if (arquivo != null) {
			System.out.println("Reproduzir o arquivo MP3: " + arquivo);
		} else {
			System.out.println("Nenhum arquivo MP3 aberto.");
		}
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Pausar a reprodução do arquivo MP3.");
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stubv
		System.out.println("Parar a reprodução do arquivo MP3.");
		arquivo = null;
	}
}
