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
		
		GameBoard playerGameBoard = new GameBoard();

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
		 playerGameBoard.printGrid();
	        Boolean isVertical = false;
	        int[] placingShip ={3,4};
	        //"horizontal or verical"
	        int count = 0;
	        if (isVertical == true){

	            for (int i = placingShip[1]; i < ( placingShip[1]+5);i++){

	                int newX = placingShip[1]+ count;
	                int sameY = placingShip[0];
	                int[] shipCoord ={sameY,newX};

	                //playerGameBoard.shipToken(shipCoord);
	                player.ships.add(shipCoord);

	                count++;


	            }
	        }

	        if (isVertical == false){

	            for (int i = placingShip[0]; i < ( placingShip[0]+5);i++){
	                int newY = placingShip[0]+ count;
	                int sameX = placingShip[1];
	                int[] shipCoord ={newY,sameX};

	                //playerGameBoard.shipToken(shipCoord);
	                player.ships.add(shipCoord);

	                count++;
	            }
	        }
	        for (int i =0; i< 11; i++ ){
	           /* System.out.println(" Enter y");
	            int y = reader.nextInt();
	            System.out.println(" Enter x");
	            int x = reader.nextInt();
	*/
	            int[] playerFireShot = {i, i};
	            playerGameBoard.fireToken(playerFireShot);
	            player.shotsFired.add(playerFireShot);
	        }

	        for (int i = 0; i < player.ships.size() ; i++) {
	            playerGameBoard.shipToken(player.ships.get(i));

	            //todo work out the logic for it to keep one coord then loop thought the second list and checking for a match
	                int [] fired = player.shotsFired.get(i);

	                int [] shipCurrent = player.ships.get(i);

	            for (int j = 0; j < player.ships.size() ; j++) {
	                if(fired == shipCurrent ) {
	                    //place the token of the hit coordinate

	                    playerGameBoard.hitToken(player.shotsFired.get(i));

	                    //set the coordinate of the macthing coord
	                    player.shipHit.add(player.shotsFired.get(i));



	                }
	            }


	        }





	        playerGameBoard.printGrid();
	       // int[] playerFireShot ={ 5,5 };
	        //int[] playerFireShot1 ={ 6,5 };

	       // playerGameBoard.fireToken(playerFireShot1);

	        //playerGameBoard.fireToken(7, 5);
	        //playerGameBoard.fireToken(5, 10);
	        //player.shiplist.add(playerFireShot1);


	       // System.out.println( player.shiplist.toArray());


	      //  System.out.println( player.shiplist.iterator());

	       // playerGameBoard.ship(6, 5);
	      //  playerGameBoard.ship(6, 5);
	      //  playerGameBoard.ship(6, 6);
	      //  playerGameBoard.ship(6, 7);

	        //playerGameBoard.printGrid();


	}

}
