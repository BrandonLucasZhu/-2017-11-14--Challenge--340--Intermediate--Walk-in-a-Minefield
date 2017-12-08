import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;

public class Game {

	private static Minefieldboard board = new Minefieldboard();
	private static Robot robo = new Robot(); 
	
	public Game(){
		board = new Minefieldboard();
		robo = new Robot();
	}
	
	public static void main(String[] args){
		board.displayBoard();
		System.out.println("Please enter the coordinates for the robot");
		Scanner read_command = new Scanner(System.in);
		String input_command = read_command.nextLine();
		char[] split_input = input_command.toCharArray();//read each individual command
		for (char per_command : split_input) {
		    
		}
		
	}
	
}
