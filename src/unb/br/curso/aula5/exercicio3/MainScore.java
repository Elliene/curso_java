package unb.br.curso.aula5.exercicio3;

import java.util.HashMap;
import java.util.Map;

public class MainScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Team A", 20);
		scores.put("Team B", 3);
		scores.put("Team C", 30);
		scores.put("Team D", 15);

		String playerWithMaxScore = getTeamWithHighestScore(scores);
		System.out.println("Team with highest score: " + playerWithMaxScore);
	}



}


