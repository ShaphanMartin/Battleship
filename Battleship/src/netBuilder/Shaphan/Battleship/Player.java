package netBuilder.Shaphan.Battleship;

import java.util.ArrayList;
import java.util.List;

public class Player extends User {

	List<int[]> shotsFired = new ArrayList<int[]>();
	List<int[]> shipHit = new ArrayList<int[]>();
	List<int[]> ships = new ArrayList<int[]>();

	public boolean checkValidCoord(int[] checkCoords) {
		boolean inRange = false;
		int gridSize = 11;
		
			if (checkCoords[0] > gridSize || checkCoords[1] > gridSize) {
				System.out
						.println("Coordiante is too big must be in range of your board size");
				inRange = false;

			} else if (checkCoords[0] < 0 || checkCoords[1] < 0) {
				System.out
						.println("Coordiante is too small must be in range of your board size");
				inRange = false;
			} else {
				inRange = true;
			}
		return inRange;
		
	}
	
	public boolean checkValidCoordNoMsg(int[] checkCoords) {
		boolean inRange = false;
		int gridSize = 11;
			if (checkCoords[0] > gridSize || checkCoords[1] > gridSize) {
				inRange = false;

			} else if (checkCoords[0] < 0 || checkCoords[1] < 0) {
				inRange = false;
			} else {
				inRange = true;
			}
		return inRange;
		
	}

	public void TakeAShot(int[] shotCoords) {

	}


	public void placeShip(int[] playerStartCoord, int[] playerEndCoord,
			int shipSize) {

		/*
		 * place the ship get the ship size start and end point of the ship get
		 * the orientation
		 * 
		 * using the gird form gameboard place the "#" on the board and store
		 * the coordinates that the ships take up to the player.
		 */

	}

	public int[] contvertStringToNum(String[] playerCoords) {

		int[] newCoord = new int[2];

		String stringX = playerCoords[0];
		int numX = Integer.parseInt(stringX);

		String stringY = playerCoords[1];
		char charY = stringY.charAt(0);
		int numY = Character.toUpperCase(charY) - 'A' + 1;

		newCoord[0] = numY;
		newCoord[1] = numX;

		return newCoord;

	}

	public Player() {

		// TODO Auto-generated constructor stub
	}


	@Override
	public void Fire() {
		
		
		
	}

	@Override
	public void PlaceShip() {
		// TODO Auto-generated method stub
		
	}

}
