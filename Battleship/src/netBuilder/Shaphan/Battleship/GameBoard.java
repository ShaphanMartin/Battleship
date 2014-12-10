package netBuilder.Shaphan.Battleship;

public class GameBoard {
	int gridSize = 20;
	char character = 'A';

	String[][] grid = new String[gridSize][gridSize];

	public void initGrid() {
		for (int column = 0; column < grid.length; column++) {
			for (int row = 0; row < grid.length; row++) {
			
				grid[row][column] = "~";
			}
		}
	}

	public void printGrid() {
		char character = 'A';

		System.out.println();

		// printing the row labels
		for (int row = 0; row < grid.length; row++) {
			grid[0][row] = String.valueOf(row);
			System.out.print("  " + grid[0][row] + " \t");

		}

		// printing the columns labels

		for (int column = 0; column < grid.length; column++) {
			System.out.println();
			System.out.println();
			grid[1][column] = String.valueOf(character);
			character++;
			System.out.print(grid[1][column] + "\t");
			for (int row = 0; row < grid.length; row++) {
				//if (grid[row][column] == "~") {
				//	System.out.print("  " + grid[row][column] + "\t");
					
			//	} 
			if (grid[row][column] == "X") {
					System.out.print("  " + grid[row][column] + "\t");

				} else if (grid[row][column] == "*") {
					System.out.print("  " + grid[row][column] + "\t");
				}else{
					grid[row][column] = "~";
					System.out.print("  " + grid[row][column] + "\t");

					
				}

			}

		}

	}

	public void fire(int xCoord, int yCoord) {
		grid[xCoord][yCoord] = "X";
	}

}
