package Sept18;

import java.util.ArrayList;
import java.util.Collections;

public class Scoreboard{

	private String name; 
	private ArrayList<GameEntry> scores;
	
	public Scoreboard(String n) {
		this.name = n;
		this.scores = new ArrayList<>();
	}
	
	public void addScore(String player, int score) {
		
		GameEntry g = new GameEntry(score, player);
		scores.add(g);
		Collections.sort(scores);
	
	}
	
	public void printScoreboard() {
		
		for(GameEntry g: scores) {
			g.printEntry();
			
		}
	}
	
	public void removeScore(String search) { 
		
		for(int i = 0; i < scores.size(); i++) {
			
			String name = scores.get(i).getName();
			if(name.equals(search)) {
				scores.remove(i);
				break;
			}
		}

		
	}

	public void topFive() {
        int limit = Math.min(5, scores.size());  // Ensure no out-of-bounds error if there 
		for(int i = 0; i < 5; i ++) {
			scores.get(i).printEntry();
		}
	}
	
}
