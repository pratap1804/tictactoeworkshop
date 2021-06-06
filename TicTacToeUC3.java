public class TicTacToeUC3{
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


/**
Declaring Symbols 'X'for the player for appropriate positions on the game board
*/

			switch() {
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
		
	
	}
