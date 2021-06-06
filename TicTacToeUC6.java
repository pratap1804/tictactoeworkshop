public class TicTacToeUC6{
/**
Displaying GameBoard
*/
public static void main( String[] args )
	{
        char[][] gameBoard= {{' ','|',' ','|',' '},
        		{'-','+','-','+','-'},
        		{' ','|',' ','|',' '},
        		{'-','+','-','+','-'},
        		{' ','|',' ','|',' '}};
/**
Method displaying Game Board
*/
		showBoard(gameBoard);
/**
Scanner method for taking the input of the player into the valid cells and then displaying it
*/ 
		int Toss =(int) Math.random();
		if(Toss>=0.5){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Placements (1-9)");
		int pos = scan.nextInt();
		System.out.println(pos);
		} else {
		Random rand = new Random();
		int cpuPos=rand.nextInt(9)+1;
		}
		placeSymbol(gameBoard, playerPos, "player");

		placeSymbol(gameBoard, playerPos, "cpu");
	}
		
/**
Method for displaying all the valid cells of the game board
*/

	public static void showBoard(char[][] gameBoard){
		for(char[] row : gameBoard){
			for(char c: row){
				System.out.print(c);
		}
			System.out.println();
	}
}

	

	public static void placeSymbol(char[][] gameBoard, int pos, String user){

/**
Declaring Symbols 'X'for the player for appropriate positions on the game board
*/

			char symbol=' ';
			if(user.equals("player")){
				symbol='X'; 
				playerPositions.add(pos);
				} else if(user.equals("cpu")) {
					symbol='O';
					cpuPositions.add(pos);
				}switch(pos) {
        case 1:
        	gameBoard[0][0]='X';
        	break;
        case 2:
        	gameBoard[0][2]='X';
        	break;
        case 3:
        	gameBoard[0][4]='X';
        	break;
        case 4:
        	gameBoard[2][0]='X';
        	break;
        case 5:
        	gameBoard[2][2]='X';
        	break;
        case 6:
        	gameBoard[2][4]='X';
        	break;
        case 7:
        	gameBoard[4][0]='X';
        	break;
        case 8:
        	gameBoard[4][2]='X';
        	break;
        case 9:
        	gameBoard[4][4]='X';
        	break;
        }
		
		showBoard(gameBoard);
	}
}
