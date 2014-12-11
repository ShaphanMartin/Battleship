package netBuilder.Shaphan.Battleship;

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
		
		String  playerName;
		String  Coordx;
		String  Coordy;

		Player player = new Player();
	/*	
		
		System.out.println("Welcome to Battleship");
		System.out.println("Enter your Name");
		playerName = reader.next();
		
		System.out.println( playerName +" enter the grid size");
		player.setGridSize(gridSize=reader.nextInt() + 1);
		
	//	for (int i = 0; i < 5; i++) {
			System.out.println(playerName
					+ " enter first part of the starting coord (Letter)");
			
			playerStartCoord[0] = reader.next();
			
			System.out.println(playerName
					+ " enter second part of the starting coord (number)");
			playerStartCoord[1] = reader.next();
			
			System.out.println(playerStartCoord[0] + playerStartCoord[1]);
			

			//player.shiplist.add(i,newPlayerStartCoord);
			
		//}

		newPlayerStartCoord = player.contvertStringToNum(playerStartCoord);
		
		
		
		//newPlayerStartCoord = player.contvertStringToNum(playerStartCoord);
		
		playerEndCoord[0] = "5";
		playerEndCoord[1] = "b";
		
		//newPlayerEndCoord = player.contvertStringToNum(playerEndCoord);
		
		//System.out.println(playerStartCoord);
		player.placeShip( newPlayerStartCoord, newPlayerEndCoord, ShipName.AircaftCarrier.getSize());
		
	*/	
		
		GameBoard test = new GameBoard();

/*
		
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
		int[] playerFireShot ={ 5,5 };
		int[] playerFireShot1 ={ 6,5 };

		test.fire(playerFireShot);
		test.fire(playerFireShot1);

		//test.fire(7, 5);
		//test.fire(5, 10);
		player.shiplist.add(playerFireShot);
		player.shiplist.add(playerFireShot1);

		System.out.println( player.shiplist.get(0));
		System.out.println( player.shiplist.listIterator(0));
		System.out.println( player.shiplist.toArray());


		System.out.println( player.shiplist.iterator());
		
		


		//test.printGrid();
		
		test.ship(6, 5);
		test.ship(6, 5);
		test.ship(6, 6);
		test.ship(6, 7);
		
		//test.printGrid();
		


	}

}
