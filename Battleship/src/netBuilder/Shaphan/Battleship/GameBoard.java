package netBuilder.Shaphan.Battleship;

import java.util.Random;

public class GameBoard {
	char character = 'A';
	int gridSize = 11;
	String[][] grid = new String[gridSize][gridSize];

	Player player = new Player();

	public void initGrid(int gridSize) {
		for (int column = 0; column < grid.length; column++) {
			for (int row = 0; row < grid.length; row++) {

				grid[row][column] = "~";
			}
		}
	}

	public void printGrid() {

		//char character = 'A';
		System.out.println("======================================================================================");
		System.out.print(grid[0][0] = "\t ");

		// printing the row labels
		for (int row = 1; row < grid.length; row++) {

			grid[0][row] = String.valueOf(row);
			System.out.print("  " + grid[0][row] + " \t");

		}
		System.out.println();

		// printing the columns labels

		for (int column = 1; column < grid.length; column++) {
			if (column == 1){
			System.out.println("======================================================================================");
			}
			System.out.println();
			System.out.println();
			//grid[1][column] = String.valueOf(character);
			
			System.out.print(column + "\t");
			//character++;
			for (int row = 1; row < grid.length; row++) {

				if (grid[row][column] == "X") {
					System.out.print("  " + grid[row][column] + "\t");

				} else if (grid[row][column] == "*") {
					System.out.print("  " + grid[row][column] + "\t");
				} else if (grid[row][column] == "#") {
					System.out.print("  " + grid[row][column] + "\t");
				} else {
					grid[row][column] = "~";
					System.out.print("  " + grid[row][column] + "\t");

				}

			}

		}
		System.out.println();

	}
	public void printGrid2() {

		//char character = 'A';
		System.out.println("======================================================================================");
		System.out.print(grid[0][0] = "\t ");

		// printing the row labels
		for (int row = 1; row < grid.length; row++) {

			grid[0][row] = String.valueOf(row);
			System.out.print("  " + grid[0][row] + " \t");

		}
		System.out.println();

		// printing the columns labels

		for (int column = 1; column < grid.length; column++) {
			if (column == 1){
			System.out.println("======================================================================================");
			}
			System.out.println();
			System.out.println();
			//grid[1][column] = String.valueOf(character);
			
			System.out.print(column + "\t");
			//character++;
			for (int row = 1; row < grid.length; row++) {

				if (grid[row][column] == "X") {
					System.out.print("  " + grid[row][column] + "\t");

				} else if (grid[row][column] == "*") {
					System.out.print("  " + grid[row][column] + "\t");
				//} else if (grid[row][column] == "#") {
				//	System.out.print("  " + grid[row][column] + "\t");
				} else {
					grid[row][column] = "~";
					System.out.print("  " + grid[row][column] + "\t");

				}

			}

		}
		System.out.println();

	}

	public void check(int xCoord, int yCoord) {

		if (xCoord > gridSize || xCoord > gridSize) {
			System.out.println("Coordiante is too big");
		} else if (xCoord < 0 || xCoord < 0) {
			System.out.println("Coordiante is too small");

		}
	}


    public void fireToken(int Coord[]) {
        grid[Coord[0]][Coord[1]] = "*";
    }

    public void shipToken(int Coord[]) {
        grid[Coord[0]][Coord[1]] = "#";

    }
    public void hitToken(int Coord[]) {
        grid[Coord[0]][Coord[1]] = "X";

    }

}
