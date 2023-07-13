package unb.br.curso.aula5.exercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDuplicados duplicados = new ListaDuplicados();
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(2);
		numeros.add(3);
		List<Integer> resp = duplicados.findDuplicates(numeros);
		System.out.println(Arrays.toString(resp.toArray()));

	}

}
