package netBuilder.Shaphan.Battleship;

import java.util.Arrays;
import java.util.Scanner;

public class playGame {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		Player player = new Player();
		AiPlayer aiPlayer = new AiPlayer();

		GameBoard playerGameBoard = new GameBoard();
		playerGameBoard.printGrid();

		/*
		 * ======================================================================
		 * =========
		 * 
		 * Placing players ships TODO extract into the player class and create
		 * smaller methods
		 * ======================================================
		 * ==========================
		 */

		int[] shipSizes = { 5, 4, 3, 3, 2 };
		for (int j = 0; j < 5; j++) {

			int[] placingShip = new int[2];
			// System.out.println("Enter the coordinates for the first ship (its length is "+
			// shipSizes[j] + " )");

			do {

				System.out.println("Enter the x coordinate");
				int y = reader.nextInt();
				placingShip[1] = y;
				System.out.println("Enter the y coordinate");
				int x = reader.nextInt();
				placingShip[0] = x;

			} while (!player.checkValidCoord(placingShip));

			System.out
					.println("Is it going to be placed vertically ( y or n )");
			String vertical = reader.next();
			if (vertical.equals("y")) {
				int count = 0;
				for (int i = placingShip[1]; i < (placingShip[1] + shipSizes[j]); i++) {

					int newX = placingShip[1] + count;
					int sameY = placingShip[0];
					int[] shipCoord = { sameY, newX };

					player.checkValidCoordNoMsg(shipCoord);
					playerGameBoard.shipToken(shipCoord);
					player.ships.add(shipCoord);

					count++;

				}
			}
			if (vertical.equals("n")) {
				int count = 0;

				for (int i = placingShip[0]; i < (placingShip[0] + shipSizes[j]); i++) {
					int newY = placingShip[0] + count;
					int sameX = placingShip[1];
					int[] shipCoord = { newY, sameX };

					player.checkValidCoordNoMsg(shipCoord);
					playerGameBoard.shipToken(shipCoord);
					player.ships.add(shipCoord);

					count++;
				}
			}
			playerGameBoard.printGrid();

		}

		/*
		 * ======================================================
		 * 
		 * 
		 * Player shooting TODO shot on the enemy board
		 * ==========================
		 * ======================================================
		 */
		// aiPlayer.PlaceShip();

		int[] playerFireShot = new int[2];

		for (int i = 0; i < player.ships.size(); i++) {
			
			System.out.println("Enter the y coordinate to fire");
			int x = reader.nextInt();
			playerFireShot[1] = x;
			System.out.println("Enter the x coordinate to fire");
			int y = reader.nextInt();
			playerFireShot[0] = y;
			
			for (int ki = 0; ki < player.shotsFired.size(); ki++) {
				int[] currentShots = player.shotsFired.get(ki);
			
				if(Arrays.equals(playerFireShot, currentShots)){
					System.out.println("You have already hit that point");

				}

			}
			playerGameBoard.fireToken(playerFireShot);
			player.shotsFired.add(playerFireShot);

			
			for (int a = 0; a < player.ships.size(); a++) {
				playerGameBoard.shipToken(player.ships.get(a));

			}
			for (int j = 0; j < player.shotsFired.size(); j++) {
				int[] fired = player.shotsFired.get(j);
				
				for (int k = 0; k < player.ships.size(); k++) {
					int[] shipCurrent = player.ships.get(k);

					if (Arrays.equals(fired, shipCurrent)) {

						System.out.println("HIT!!");
						 

						// place the token of the hit coordinate

						playerGameBoard.hitToken(player.shotsFired.get(j));
						//for (int a = 0; a < player.shotsFired.size(); a++) {
							//playerGameBoard.hitToken(player.shotsFired.get(a));

						//}
						// set the coordinate of the matching coord
						player.shipHit.add(player.shotsFired.get(j));

					}
					

				}
			}
			
			playerGameBoard.printGrid2();
			
		}

		System.out.println("you hit " + player.shipHit.size() + " out of "
				+ player.ships.size() + " shots");
		
		playerGameBoard.printGrid();

		

	}
}
