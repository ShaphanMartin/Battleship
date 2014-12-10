package netBuilder.Shaphan.Battleship;

public class playGame {

	public static void main(String[] args) {
		
		GameBoard test = new GameBoard();
		//test.initGrid();
		test.printGrid();
		//GameBoard test1 = new GameBoard();
		//test1.initGrid();

		test.fire(5, 5);
		test.printGrid();


	}

}
