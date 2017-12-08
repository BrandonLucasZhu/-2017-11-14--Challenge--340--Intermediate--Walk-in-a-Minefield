import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;



public class Game {

	private static Minefieldboard board = new Minefieldboard();;
	private static Robot robo = new Robot(); 
	
	/*
	public Game(Minefieldboard board,Robot robo){
		board = new Minefieldboard();
		robo = new Robot();
	}*/
	
	public static void main(String[] args){
		board.displayBoard();
		System.out.println("Please enter the coordinates for the robot");
		Scanner read_command = new Scanner(System.in);
		String input_command = read_command.nextLine();
		char[] split_input = input_command.toCharArray();//read each individual command
		for (int i = 0; i < split_input.length; i++) {
			if (split_input[0] != '-') {
				System.out.println("Please turn on the robot.");
				System.exit(0); 
			}
			if (split_input[i] == 'E') {
				int last_locx = robo.GetLocation().getX();
				int last_locy = robo.GetLocation().getY();
				System.out.println(Robot.direction.E.movement(robo.GetLocation().getX(),robo.GetLocation().getY()));
				robo.SetLocation(Robot.direction.E.movement(robo.GetLocation().getX(),robo.GetLocation().getY()), robo.GetLocation().getY());
				board.Move(board.get_point(last_locx, last_locy),robo.GetLocation());
			}
			else if (split_input[i] == 'W') {
				robo.SetLocation(Robot.direction.W.movement(robo.GetLocation().getX(),robo.GetLocation().getY()), robo.GetLocation().getY());
			
			}
			else if (split_input[i] == 'N') {
				robo.SetLocation(robo.GetLocation().getX(),Robot.direction.N.movement(robo.GetLocation().getX(),robo.GetLocation().getY()));
			}
			else if (split_input[i] == 'S') {
				robo.SetLocation(robo.GetLocation().getX(),Robot.direction.S.movement(robo.GetLocation().getX(),robo.GetLocation().getY()));
			}
			/*else {
				System.out.println("Invalid coord.");
				System.exit(0);
			}*/
		}
		board.displayBoard();
		
	}
	
}
