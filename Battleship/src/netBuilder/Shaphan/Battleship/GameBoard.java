package netBuilder.Shaphan.Battleship;

public class GameBoard {
	int rows = 11;
	int columns = 11;
	
	int [][] grid = new int[rows][columns];
	
	
	
	public void clearGrid(){ 
	for(int i = 0; i < grid.length; i++ )
		for(int j = 0; i < grid.length; j++)
			grid [i][j] =0;
	}
	
	public void printGrid(){
		
		
		for (int clbl = 0; clbl < grid.length; ++clbl){
			grid [clbl][0] = clbl;
		}
			
		for(int i = 0; i < grid.length; ++i) {
		    for(int j = 0; j < grid[i].length; ++j) {
		         System.out.printf("%5d ", grid[i][j]);
		      }
		      System.out.println();
		      System.out.println();
	}
	}
	
	
	public void fire(int xCoord , int yCoord){
		grid [xCoord][yCoord] = 2;
	}
	
}
