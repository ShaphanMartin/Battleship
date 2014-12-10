package netBuilder.Shaphan.Battleship;

import java.util.Scanner;

public class playGame {

	public static void main(String[] args) {
		int gridSize;
		int menuOption;
		byte num3;
		
		String  playerName;
		String  input2;
		
		User player = new User();
		//player.placeShip(grid,[1][2] , [2][3], isVertical, shipSize);
		
		Scanner reader = new Scanner(System.in);
				GameBoard test = new GameBoard();

/*
		System.out.println("Welcome to Battleship");
		System.out.println("Enter your Name");
		playerName=reader.next();
		System.out.println( playerName +" enter the grid size");
		gridSize=reader.nextInt();
		System.out.println( playerName +" Press 1 to start game");
		menuOption=reader.nextInt();
		if (menuOption == 1){
				test.printGrid();
		}
		System.out.println( playerName +" Pick where you want to place your ships");
		menuOption=reader.nextInt();
		System.out.println( playerName +"Chose the 2");
		menuOption=reader.nextInt();
		
		
*/
		test.fire(5, 5);
		test.fire(6, 5);
		test.fire(7, 5);
		test.fire(5, 10);
		test.fire(22, 25);

		test.printGrid();


	}

}
