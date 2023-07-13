package unb.br.curso.aula5.exercicio3;

import java.util.Map;

public class MaxScore {

	public String getTeamWithHighestScore(Map<String, Integer> scores) {
		int maxScore = Integer.MIN_VALUE;
		String playerWithMaxScore = null;
		for (Map.Entry<String, Integer> entry : scores.entrySet()) {
			String player = entry.getKey();
			int score = entry.getValue();
			if (score > maxScore) {
				maxScore = score;
				playerWithMaxScore = player;
			}
		}
		return playerWithMaxScore;

	}
}
