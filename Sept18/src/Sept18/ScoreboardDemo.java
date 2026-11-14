package Sept18;

public class ScoreboardDemo {
	public static void main(String[] args) {
		Scoreboard scoreboard = new Scoreboard("Pac-Man");
		
		scoreboard.addScore("Jack", 5000);
		scoreboard.addScore("Reese", 15);
		scoreboard.addScore("Sally", 9200);
		scoreboard.addScore("Bob", 4000);
		scoreboard.addScore("Iliana", 8000);
		scoreboard.addScore("Mark", 2500);
		scoreboard.addScore("Jane", 7000);
		scoreboard.addScore("Sarah", 0);

		scoreboard.printScoreboard();
		System.out.println();
		scoreboard.removeScore("Bob");		
		scoreboard.printScoreboard();
		System.out.println();
		scoreboard.topFive();

	}
}
