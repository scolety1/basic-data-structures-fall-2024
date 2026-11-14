package program_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//You will likely need to import some stuff up here

public class MazeSolver {

	//2D representation of the maze. The maze will always be 12x12
	private char[][] maze = new char[12][12];
	private boolean solved = false;

	
	public MazeSolver() {
		loadMaze("maze2.txt");
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
		int start_x  = 8;
		int start_y = 11;
		
		int start_hand_x = 9;
		int start_hand_y = 11;
		
		make_move(start_x, start_y, start_hand_x, start_hand_y);
		
	}
	
	private boolean canMove(int x, int y) {
        return x >= 0 && x < 12 && y >= 1 && y < 12;
    }
	
	public void make_move(int x, int y, int hand_x, int hand_y) {
		if (solved) {
			return;
		}
	    if (x >= 1 && x < 11 && y >= 1 && y < 11) {
	    	if(maze[y-1][x] == 'F') {
	    		maze[y][x] = 'X';
		        printMaze(maze);
		        System.out.println("Exit found! Program ending...");
		        solved = true; 
		        return;
	    	}
	    }
	    	
	    maze[y][x] = 'X';
        printMaze(maze);
        
	    
		if (hand_y == y && hand_x > x) { // Facing North
			System.out.println("going North");
		    if (canMove(x + 1, y) && (maze[y][x+1] == '.' || maze[y][x+1] == 'X')) {
				System.out.println("going North turning Right");
		        make_move(x + 1, y, hand_x, hand_y + 1);
		    } 
		    else if (canMove(x, y - 1) && (maze[y - 1][x] == '.' || maze[y-1][x] == 'X')) {
				System.out.println("going North going Forward");
		        make_move(x, y - 1, hand_x, hand_y - 1);
		    } 
		    else if (canMove(x - 1, y) && (maze[y][x-1] == '.' || maze[y][x-1] == 'X')){
				System.out.println("going North turning Left");
		        make_move(x, y, hand_x - 1, hand_y - 1);
		    }
		    else {
		        System.out.println("BacktrackingN...");
		        make_move(x, y, (hand_x-2), (hand_y));
		    }
		}
		else if (hand_x == x && hand_y > y) { // Facing East
			System.out.println("going east");
			if (canMove(x, y + 1) && (maze[y+1][x] == '.' || maze[y+1][x] == 'X')){ // turn right		
				System.out.println("going East turning Right");
		        make_move(x, y + 1, (hand_x - 1), (hand_y));
		    } 
		    else if (canMove(x + 1, y) && (maze[y][x+1] == '.' || maze[y][x+1] == 'X')) { //go forward
		    	System.out.println("going East going Forward");
		        make_move(x + 1, y, (hand_x + 1), (hand_y));
		    } 
		    else if (canMove(x, y - 1) && (maze[y-1][x] == '.' || maze[y-1][x] == 'X')) { // turn left
		       System.out.println("going East turning Left");
		        make_move(x, y, (hand_x + 1), (hand_y - 1));
		    }
		    else {
		        System.out.println("BacktrackingE...");
		        make_move(x, y, (hand_x), (hand_y-2));
		    }
		}
		
		else if (hand_y == y && hand_x < x) { // Facing South
			System.out.println("going South");
		    if (canMove(x - 1, y) && (maze[y][x-1] == '.' || maze[y][x-1] == 'X')) {
				System.out.println("going South turning Right");
		        make_move(x - 1, y, hand_x, hand_y - 1);
		    } 
		    else if (canMove(x, y + 1) && (maze[y + 1][x] == '.' || maze[y+1][x] == 'X')) {
				System.out.println("going South going Forward");
		        make_move(x, y + 1, hand_x, hand_y + 1);
		    } 
		    else if (canMove(x + 1, y) && (maze[y][x+1] == '.' || maze[y][x+1] == 'X')){
				System.out.println("going South turning Left");
		        make_move(x, y, hand_x + 1, hand_y + 1);
		    }
		    else {
		        System.out.println("BacktrackingS...");
		        make_move(x, y, (hand_x+2), (hand_y));
		    }
		
		}
		
		else if (hand_x == x && hand_y < y) { // Facing West
			System.out.println("going east");
			if (canMove(x, y - 1) && (maze[y-1][x] == '.' || maze[y-1][x] == 'X')){ // turn right		
				System.out.println("going West turning Right");
		        make_move(x, y - 1, (hand_x + 1), (hand_y));
		    } 
		    else if (canMove(x - 1, y) && (maze[y][x-1] == '.' || maze[y][x-1] == 'X')) { //go forward
		    	System.out.println("going West going Forward");
		        make_move(x - 1, y, (hand_x - 1), (hand_y));
		    } 
		    else if (canMove(x, y + 1) && (maze[y+1][x] == '.' || maze[y+1][x] == 'X')) { // turn left
		       System.out.println("going West turning Left");
		        make_move(x, y, (hand_x - 1), (hand_y + 1));
		    }
		    else {
		        System.out.println("BacktrackingW...");
		        make_move(x, y, (hand_x), (hand_y+2));
		    }
		}
		else {
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