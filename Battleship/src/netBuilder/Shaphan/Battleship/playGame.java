package netBuilder.Shaphan.Battleship;

import java.util.Arrays;
import java.util.Scanner;

public class playGame {
	ShipName shipName;

	public static void main(String[] args) {
		int gridSize;
		int menuOption;
		byte num3;
		String[] playerStartCoord = new String[2];
		String[] playerEndCoord = new String[2];

		int[] newPlayerStartCoord = new int[2];
		int[] newPlayerEndCoord = new int[2];

		Scanner reader = new Scanner(System.in);

		String playerName;
		String Coordx;
		String Coordy;

		Player player = new Player();
		/*
		 * 
		 * System.out.println("Welcome to Battleship");
		 * System.out.println("Enter your Name"); playerName = reader.next();
		 * 
		 * System.out.println( playerName +" enter the grid size");
		 * player.setGridSize(gridSize=reader.nextInt() + 1);
		 * 
		 * // for (int i = 0; i < 5; i++) { System.out.println(playerName +
		 * " enter first part of the starting coord (Letter)");
		 * 
		 * playerStartCoord[0] = reader.next();
		 * 
		 * System.out.println(playerName +
		 * " enter second part of the starting coord (number)");
		 * playerStartCoord[1] = reader.next();
		 * 
		 * System.out.println(playerStartCoord[0] + playerStartCoord[1]);
		 * 
		 * 
		 * //player.shiplist.add(i,newPlayerStartCoord);
		 * 
		 * //}
		 * 
		 * newPlayerStartCoord = player.contvertStringToNum(playerStartCoord);
		 * 
		 * 
		 * 
		 * //newPlayerStartCoord = player.contvertStringToNum(playerStartCoord);
		 * 
		 * playerEndCoord[0] = "5"; playerEndCoord[1] = "b";
		 * 
		 * //newPlayerEndCoord = player.contvertStringToNum(playerEndCoord);
		 * 
		 * //System.out.println(playerStartCoord); player.placeShip(
		 * newPlayerStartCoord, newPlayerEndCoord,
		 * ShipName.AircaftCarrier.getSize());
		 */

		GameBoard playerGameBoard = new GameBoard();

		/*
		 * 
		 * System.out.println( playerName +" Press 1 to start game");
		 * menuOption=reader.nextInt(); if (menuOption == 1){ test.printGrid();
		 * } System.out.println( playerName
		 * +" Pick where you want to place your ships");
		 * menuOption=reader.nextInt(); System.out.println( playerName
		 * +"Chose the 2"); menuOption=reader.nextInt();
		 */

		int[] shipSizes = { 5, 4, 3, 3, 2 };
		playerGameBoard.printGrid();

		for (int j = 0; j < 4; j++) {

			Boolean isVertical = false;
			int[] placingShip = new int[2];
			// "horizontal or vertical"
			System.out
					.println("Enter the coordinates for the first ship (its length is "
							+ shipSizes[j] + " )");
			System.out.println("Enter the x coordinate");
			int y = reader.nextInt();
			placingShip[0] = y;
			System.out.println("Enter the y coordinate");
			int x = reader.nextInt();
			placingShip[1] = x;

			System.out.println(" is it going to be placed vertically ( y or n )");
			String vertical = reader.next();
			if (vertical.equals("y")) {

				// if (isVertical == true) {
				int count = 0;

				for (int i = placingShip[1]; i < (placingShip[1] + shipSizes[j]); i++) {

					int newX = placingShip[1] + count;
					int sameY = placingShip[0];
					int[] shipCoord = { sameY, newX };

					playerGameBoard.shipToken(shipCoord);
					player.ships.add(shipCoord);

					count++;

				}
			}
			if (vertical.equals("n")) {
				// if (isVertical == false) {
				int count = 0;

				for (int i = placingShip[0]; i < (placingShip[0] + shipSizes[j]); i++) {
					int newY = placingShip[0] + count;
					int sameX = placingShip[1];
					int[] shipCoord = { newY, sameX };

					playerGameBoard.shipToken(shipCoord);
					player.ships.add(shipCoord);

					count++;
				}
			}
			playerGameBoard.printGrid();

			
		}
		for (int i = 0; i < 11; i++) {

			int[] playerFireShot = { i, i };
			playerGameBoard.fireToken(playerFireShot);
			player.shotsFired.add(playerFireShot);
		}

		for (int i = 0; i < player.ships.size(); i++) {
			playerGameBoard.shipToken(player.ships.get(i));

		}

		for (int j = 0; j < player.shotsFired.size(); j++) {
			int[] fired = player.shotsFired.get(j);
			for (int k = 0; k < player.ships.size(); k++) {
				int[] shipCurrent = player.ships.get(k);

				if (Arrays.equals(fired, shipCurrent)) {
					// place the token of the hit coordinate

					playerGameBoard.hitToken(player.shotsFired.get(j));

					// set the coordinate of the matching coord
					player.shipHit.add(player.shotsFired.get(j));

				}

			}
		}

		playerGameBoard.printGrid();
		// int[] playerFireShot ={ 5,5 };
		// int[] playerFireShot1 ={ 6,5 };

		// playerGameBoard.fireToken(playerFireShot1);

		// playerGameBoard.fireToken(7, 5);
		// playerGameBoard.fireToken(5, 10);
		// player.shiplist.add(playerFireShot1);

		// System.out.println( player.shiplist.toArray());

		// System.out.println( player.shiplist.iterator());

		// playerGameBoard.ship(6, 5);
		// playerGameBoard.ship(6, 5);
		// playerGameBoard.ship(6, 6);
		// playerGameBoard.ship(6, 7);

		// playerGameBoard.printGrid();

	}

}
