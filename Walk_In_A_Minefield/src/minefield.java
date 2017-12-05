
public class minefield {
	
	public static String[][] grid = new String[13][8];
	
	public String[] grid_system {
		
		for (int i = 0; i < grid.length;i++) {
			for (int j=0; j < grid[i].length;j++) {
				if (i==0 || i==13) {
					grid[i][j] = "+"; //Create border walls
				}
				else if (j==0 || j==8) {
					grid[i][j] = "+"; //Create border walls
				}
				else {
					grid[i][j] = "0";
				}
			}
		}
		
	return grid;	
		
	}

}
