
public class minefield_board {
	
	private point[][] grid = new String[13][8];
	
	public minefield_board() {
		
		for (int i = 0; i < grid.length;i++) {
			for (int j=0; j < grid[i].length;j++) {
				if (i==0 || i==13 || j==0 || j==8) {
					this.grid = new point(i,j,"+");//Create border walls
				}
				else {
					this.grid = new point(i,j,"0");//regular movable tiles
				}
			}
		}		
	}
	
	 void Move(Point p1, Point p2);
	
	

}
