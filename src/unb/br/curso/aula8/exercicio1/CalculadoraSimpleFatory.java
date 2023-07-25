package unb.br.curso.aula8.exercicio1;

import aula7calculadoraarmazenamento.Armazenamento;
import aula7calculadoraarmazenamento.ArmazenamentoArquivo;
import aula7calculadoraarmazenamento.ArmazenamentoH2;
import unb.br.curso.aula8.exercicio2.ArmazenamentoMeuBanco;

public class CalculadoraSimpleFatory {

	public static final String ARQ = "ARQ";
	public static final String H2 = "H2";
	public static final String POS = "POS";

	private CalculadoraSimpleFatory() {

		// TODO Auto-generated constructor stub
	}

	public static Armazenamento createArmazenamento(String tipo) throws Exception {
		if (tipo.equals(ARQ)) {
			return new ArmazenamentoArquivo();

		} else if (tipo.equals(H2)) {
			return new ArmazenamentoH2();
		} else if (tipo.equals(POS)) {
			return new ArmazenamentoMeuBanco();
		} else {
			throw new Exception("tipo de armazenamento nao existe" + tipo);
		}

	}

}