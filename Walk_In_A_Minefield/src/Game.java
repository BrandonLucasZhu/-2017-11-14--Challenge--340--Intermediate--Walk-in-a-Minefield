import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;

public class Game {

	private static Minefieldboard board;
	private static Robot robo; 
	
	public Game(){
		board = new Minefieldboard();
		robo = new Robot();
	}
	
	public static void main(String[] args){
		//System.out.println("Please enter the coordinates for the robot");
		//Scanner read_command = new Scanner(System.in);
		//String input_command = read_command.nextLine();
		//System.out.println(board.getType());
		board.displayBoard();
		
	}
	
}
