package program_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//You will likely need to import some stuff up here

public class MazeSolver2 {

	//2D representation of the maze. The maze will always be 12x12
	private char[][] maze = new char[12][12];
	private boolean solved = false;

	
	public MazeSolver2() {
		loadMaze("maze.txt");
		printMaze(maze);
		solveMaze();
		
	}
	
	public char[][] loadMaze(String filename){
	    try (Scanner scanner = new Scanner(new File(filename))) {
			for(int i = 0; i < 12; i++) {
				maze[i] = scanner.nextLine().toCharArray();
			}
		} catch(FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}
		return maze;
		
	}
	
	
	private void printMaze(char[][] maze) {
		for(char[] row : maze) {
			System.out.println(row);
		}
		System.out.println();
	}

	public void solveMaze() {
		// PART 3: You don't really need to do anything here

		// starting parameters for "maze.txt"
		// If you are using a different maze, you will need to change these four values
		int start_x  = 0;
		int start_y = 2;
		
		int start_hand_x = 0;
		int start_hand_y = 3;
		
		make_move(start_x, start_y, start_hand_x, start_hand_y);
		
	}
	
	private boolean canMove(int x, int y) {
        return x >= 0 && x < 12 && y >= 0 && y < 12 && (maze[y][x] == '.' || maze[y][x] == 'F');
    }
	
	
	public void make_move(int x, int y, int hand_x, int hand_y) {
	    if (solved) {
	        return;
	    }
	    if (maze[y][x] == 'F') {
	        System.out.println("Maze solved!");
	        printMaze(maze);
	        solved = true; 
	        return;
	    }

	    maze[y][x] = 'X';
	    printMaze(maze);

	    int[][] directions = {
	        {1, 0}, 
	        {0, -1}, 
	        {-1, 0}, 
	        {0, 1}  
	    };

	    int handDirection = -1;
	    for (int i = 0; i < directions.length; i++) {
	        int hand_dx = x + directions[i][0];
	        int hand_dy = y + directions[i][1];
	        if (hand_dx == hand_x && hand_dy == hand_y) {
	            handDirection = i;
	            break;
	        }
	    }

	    if (handDirection == -1) {
	        System.out.printf("Hand direction could not be determined. x: %d, y: %d, hand_x: %d, hand_y: %d\n", x, y, hand_x, hand_y);
	        throw new IllegalStateException("Invalid hand direction.");
	    }

	    for (int i = 0; i < directions.length; i++) {
	        int moveDirection = (handDirection + i) % directions.length;

	        int newX = x + directions[moveDirection][0];
	        int newY = y + directions[moveDirection][1];

	        if (canMove(newX, newY)) {
	            int newHandX = newX + directions[(moveDirection + 1) % directions.length][0];
	            int newHandY = newY + directions[(moveDirection + 1) % directions.length][1];

	            make_move(newX, newY, newHandX, newHandY);
	            return;
	        }
	    }

	    maze[y][x] = '.'; 
	    if (!solved) {
	        System.out.println("Backtracking...");
	    }
	}
}
/*
	private void turnRight(int x, int y, int hand_x, int hand_y) {
	    maze[y][x] = 'X'; 
	    printMaze(maze);

	    if (hand_y == y && hand_x > x) { 
	        make_move(x + 1, y, x + 1, y + 1); 
	    } else if (hand_x == x && hand_y > y) {
	        make_move(x, y + 1, x - 1, y + 1);
	    } else if (hand_y == y && hand_x < x) {
	        make_move(x - 1, y, x - 1, y - 1); 
	    } else if (hand_x == x && hand_y < y) {
	        make_move(x, y - 1, x + 1, y - 1); 
	    }
	}
	
	private void turnLeft(int x, int y, int hand_x, int hand_y) {
	    maze[y][x] = 'X';
	    printMaze(maze);

	    if (hand_y == y && hand_x > x) {
	        make_move(x - 1, y, x - 1, y - 1);
	    } else if (hand_x == x && hand_y > y) {
	        make_move(x, y - 1, x + 1, y - 1);
	    } else if (hand_y == y && hand_x < x) { 
	        make_move(x + 1, y, x + 1, y + 1); 
	    } else if (hand_x == x && hand_y < y) { 
	        make_move(x, y + 1, x - 1, y + 1); 
	    }
	}
	
	private void moveForward(int x, int y, int hand_x, int hand_y) {
		maze[y][x] = 'X';
		printMaze(maze);
		
		if (hand_y == y && hand_x > x) {
	        make_move(x, y - 1, x + 1, y - 1);
	    } else if (hand_x == x && hand_y > y) {
	        make_move(x + 1, y, x + 1, y + 1);
	    } else if (hand_y == y && hand_x < x) { 
	        make_move(x, y + 1, x - 1, y + 1); 
	    } else if (hand_x == x && hand_y < y) { 
	        make_move(x - 1, y, x - 1, y - 1); 
	    }	}
	
*/