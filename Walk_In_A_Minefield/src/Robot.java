
public class Robot {
	
	private int start_robot; //1 = On, 0 = Off
	private int direction;  // N for up, S for down, E for east, W for west
	private Point p; 
	private Minefieldboard b;
	
	//Create a initial robot
	Robot(Point p, Minefieldboard b, int on_or_off, int d){
		this.p = p;
		this.b = b;
		start_robot = on_or_off; 
		direction = d;
	}
    
	public getStatus() {
		return start_robot;
	}
	
	protected boolean isMoveValid() {
    	if (p.getType.equals("+")) {
    		return false;
    	}
    	return true;
    }
    
	
}
