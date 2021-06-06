import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeUC8 {
	
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
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
		while(true) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Placements (1-9)");
		int playerPos = scan.nextInt();
		
		while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions)) {
			System.out.println("Position Taken");
			playerPos=scan.nextInt();
		}
		
		placeSymbol(gameBoard, playerPos, "player");
		
		String result =checkWinner();
		if(result.length()>0) {
			System.out.println(result);
			break;
		}
		
		Random rand = new Random();
		int cpuPos=rand.nextInt(9)+1;
		while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
			cpuPos=rand.nextInt(9)+1;
		
		}
		placeSymbol(gameBoard, cpuPos, "cpu");
		
		showBoard(gameBoard);
		
		result =checkWinner();
		if(result.length()>0) {
			System.out.println(result);
			break;
		}
		
	}	
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
 		This placeSymbol() method is calling the user-input whether its player or CPU
		 */
		public static void placeSymbol(char[][] gameBoard, int pos, String user){

	/**
	Declaring Symbols 'X'for the player and symbol 'O' for the CPU and placing the symbols in appropriate positions on the game board.
	*/
			char symbol=' ';
			if(user.equals("player")){
				symbol='X'; 
				playerPositions.add(pos);
				} else if(user.equals("cpu")) {
					symbol='O';
					cpuPositions.add(pos);
				}
				switch(pos) {
	        case 1:
	        	gameBoard[0][0]=symbol;
	        	break;
	        case 2:
	        	gameBoard[0][2]=symbol;
	        	break;
	        case 3:
	        	gameBoard[0][4]=symbol;
	        	break;
	        case 4:
	        	gameBoard[2][0]=symbol;
	        	break;
	        case 5:
	        	gameBoard[2][2]=symbol;
	        	break;
	        case 6:
	        	gameBoard[2][4]=symbol;
	        	break;
	        case 7:
	        	gameBoard[4][0]=symbol;
	        	break;
	        case 8:
	        	gameBoard[4][2]=symbol;
	        	break;
	        case 9:
	        	gameBoard[4][4]=symbol;
	        	break;
	        	default:
	        		break;
	        }
		}
		
		/**
		This checkWinner() method is created to call a list of all possible conditions of winning the TicTacToe game.
		 */
		public static String checkWinner() {
		
		List topRow =   Arrays.asList(1,2,3);
		List midRow =   Arrays.asList(4, 5, 6);
		List botRow =   Arrays.asList(7, 8, 9);
		List leftCol =  Arrays.asList(1, 4, 7);
		List midCol =   Arrays.asList(2, 5, 8);
		List rightCol = Arrays.asList(3, 6, 9);
		List cross1 =   Arrays.asList(1, 5, 9);
		List cross2 =   Arrays.asList(7, 5, 3);
		
		/**
		 Here making a list of winning condition and adding all the winning variable into the Listing variable "winning".
		 */
		
		List <List> winning = new ArrayList<List>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(leftCol);
		winning.add(midCol);
		winning.add(rightCol);
		winning.add(cross1);
		winning.add(cross2);
		
		/**
		 Checking if the Player positions or the CPU positions are containing the winning conditions or not by using for-each looping condition.
		 Also checking if the TicTacToe game end up in a draw situation then return "Draw" to the checkWinner() method. 
		 */
		
		for(List l: winning) {
			if(playerPositions.containsAll(l)) {
				return "Congratulations You Have Won!";
			}else if(cpuPositions.containsAll(l)) {
				return " Sorry You Lost!";
			} else if(playerPositions.size()+ cpuPositions.size()==9 ) {
				return "Its A Draw!";
			}
		}
		return "";
	}

}
