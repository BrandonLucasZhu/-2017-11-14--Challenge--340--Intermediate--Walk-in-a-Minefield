
public class Robot {
	
	private boolean start_robot; //True = on, False = Off
	private Point p; 
	private Minefieldboard b;
	
	public enum direction {
		N, S, E, W;
		
		  int movement(int x, int y) {
		        switch (this) {
		            case N:
		                return y+1;
		            case S:
		                return y-1;
		            case E:
		                return x+1;
		            case W:
		                return x-1;
		            default:
		                throw new AssertionError("Unknown operations " + this);
		        }
		    }
		
	}  // N for up, S for down, E for east, W for west
	
	//Create a robot
	public Robot() {
		this.p = new Point(6,0,"M");
		start_robot = false; 
	}
	
	public Point GetLocation() {
		return p;
	}
    
	void SetLocation(Point p,int x, int y) {
		p.setX(x);
		p.setY(y);
	}
	
	
	public boolean getStatus() {
		return start_robot;
	}
	
	
    
	
}
