package netBuilder.Shaphan.Battleship;

public class Player {

	int noShots = 5;
	int gridSize;

	public boolean checkValidCoord(int[] checkCoords, int gridSize) {
		boolean inRange = false;
		boolean ValidCoord = false;

		do {
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
		} while (!inRange);

		if (inRange && notHitShip) {
			ValidCoord = true;

			return ValidCoord;
		} else {
			ValidCoord = false;
			return ValidCoord;
		}

	}

	public void TakeAShot(int[] shotCoords) {

	}

	public int getGridSize() {
		return gridSize;
	}

	public void setGridSize(int gridSize) {
		this.gridSize = gridSize;
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

}
