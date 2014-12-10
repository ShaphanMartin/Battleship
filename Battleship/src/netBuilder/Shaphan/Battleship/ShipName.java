package netBuilder.Shaphan.Battleship;

public enum ShipName {
	
	AircaftCarrier(5), 
	Battleship(4), 
	Submarine(3), 
	Cruisr(3), 
	Destroyer(2) ;
	
	private int size;
	
    private ShipName(int size) {
        this.size = size;
    }

    public int getSize(){
    	return size;
    }
}


