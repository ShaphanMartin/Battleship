package netBuilder.Shaphan.Battleship;

public class GameBoard {
	int rows = 10;
	int columns = 10;
	
	int [][] grid = new int[rows][columns];
	
	
	public void clearGrid(){ 
		
	
	for(int i = 0; i < grid.length; i++ )
		for(int j = 0; i < grid.length; j++)
			grid [i][j] =0;
	

	}
	
	public void printGrid(){
		for(int i = 0; i < grid.length; i++ )
			for(int j = 0; i < grid.length; j++){
		         System.out.printf("%5d ", grid[i][j]);
		      }
		      System.out.println();
	}
		
	public static void main(String[] args) {

		//printGrind();
		
	}
}
