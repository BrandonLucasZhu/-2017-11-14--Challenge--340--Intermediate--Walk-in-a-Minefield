
public class Minefieldboard {
	
	private Point[][] grid = new Point[8][13];
	private String disp_board = "";
	private Robot robo_coord = new Robot(); //Keep track of the location of the robot
	
	public Minefieldboard() {
		
		for (int i = 0; i < grid.length;i++) {
			for (int j=0; j < grid[i].length;j++) {
				if (i==0 || i==grid.length-1 || j==0 || j==grid[i].length-1) {
					this.grid[i][j] = new Point(i,j,"+");//Create border walls
				}
				else {
					this.grid[i][j] = new Point(i,j,"0");//regular movable tiles
				}
				
			}
		}
		this.grid[5][5] = new Point(5,5,"*"); //Some hardcoded mines for testing
		this.grid[6][4] = new Point(6,4,"*");
		this.grid[3][3] = new Point(3,3,"*");
		
		this.grid[1][12] = new Point(1,12,"0"); // The hardcoded exit of the map
		this.grid[6][0] = new Point(6,0,"M");
	}
	
	//public String toString() {
     //   return this.name + "," + this.number;
    //}
	
	//Transpose Array display to get proper coordinate positive x and y axis
	public void displayBoard() {
		disp_board = "";
		for (int i = grid[0].length-1; i >= 0; i--){
		      for (int j = grid.length-1; j >= 0; j--){
		    	  System.out.print(grid[j][i].getType() + " ");
		    	  
		      }
		      System.out.println();
		}
	
	}
	
	public Point get_point(int i, int j) {
		return grid[i][j]; 
	}
		
	public void Move(Point p1,Point p2) {
		grid[p2.getX()][p2.getY()] = p2; //update coordinates
		//grid[p2.getX()][p2.getY()] = p2.setType("M"); //update board with robot move completed
	}
	 
	public void isMine(Point p) {
		if (grid[p.getX()][p.getY()].getType().equals("*")) {
	    	System.out.println("Game over, the robot touched a mine");
	    	System.exit(0);
	    }
	}
	
	public void hit_boundary(Point p) {
	    if (grid[p.getX()][p.getY()].getType().equals("+")) {
	    	System.out.println("Game over, the robot crashed into a wall");
	    	System.exit(0);
	    }
	}

}
