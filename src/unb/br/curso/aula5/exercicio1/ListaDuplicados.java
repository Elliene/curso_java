package unb.br.curso.aula5.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class ListaDuplicados {

	public List<Integer> findDuplicates(List<Integer> numbers) {
		List<Integer> duplicados = new ArrayList<>();
		Set<Integer> semDuplicacao = new HashSet<>();

		for (Integer n : numbers) {
			if (semDuplicacao.contains(n)) {
				duplicados.add(n);
			} else {
				semDuplicacao.add(n);
			}
		}
		return duplicados;

	}

}
