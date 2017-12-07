
public class Minefieldboard {
	
	private Point[][] grid = new Point[13][8];
	
	public Minefieldboard() {
		
		for (int i = 0; i < grid.length;i++) {
			for (int j=0; j < grid[i].length;j++) {
				if (i==0 || i==grid.length || j==0 || j==grid[i].length) {
					this.grid[i][j] = new Point(i,j,"+");//Create border walls
					
				}
				else {
					this.grid[i][j] = new Point(i,j,"0");//regular movable tiles
				}
				System.out.println(grid[i][j].getType());
			}
		}
		this.grid[5][5] = new Point(5,5,"*"); //Some hardcoded mines for testing
		this.grid[7][4] = new Point(7,4,"*");
		this.grid[3][3] = new Point(3,3,"*");
		
		this.grid[13][2] = new Point(13,2,"0"); // The hardcoded exit of the map
		
	}
	
	public void displayBoard() {
		for (int row = 0; row < grid.length; row++){
		      System.out.println("");
		      System.out.println("---------------------------------");

		      for (int column = 0; column < grid[row].length; column++){
		          System.out.print("| " + " " + " ");
		      }       
		      System.out.print("|");
		}
		    System.out.println("");
		    System.out.println("---------------------------------");
	}
	
	public Point get_point(int i, int j) {
		return grid[i][j]; 
	}
		
	 void Move(Point p1, Point p2) {
		 p2=p1;
	 }
	
	 protected boolean hit_boundary(Point p) {
	    	if (p.getType().equals("+")) {
	    		return false;
	    	}
	    	return true;
	    }

}
