package unb.br.curso.aula5.exercicio2;

import java.util.*;

public class MainOcorrencias {

	public static void main(String[] args) {
		Ocorrencias o = new Ocorrencias();
		List<String> list = new ArrayList<>();
		list.add("Jose");
		list.add("Maria");
		list.add("Maria");
		list.add("Milene");
		list.add("Joao");
		list.add("Joao");
		System.out.print(o.countOcorrences(list));

	}

}
