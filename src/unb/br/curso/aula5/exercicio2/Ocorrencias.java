package unb.br.curso.aula5.exercicio2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ocorrencias {

	public Map<String, Integer> countOcorrences(List<String> strings) {
		Map<String, Integer> occurrences = new HashMap<>();

		for (String str : strings) {

			if (occurrences.containsKey(str)) {

				occurrences.put(str, occurrences.get(str) + 1);
			} else {

				occurrences.put(str, 1);
			}
		}

		return occurrences;
	}

}
