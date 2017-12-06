
public class point {
	
	 private int x, y;
	 private String tile; 
	 
	 public point(int i, int j, String tile) {
		 x = i; 
		 y = j;
		 this.tile = tile;
	 }
	 
	 public	int getX() {
		 return x; 
	 }
	 public int getY(){
		 return y;
	 }
	 
	 public String getType() {
		 return tile; //Returns the type of tile
	 }
	 
	 
}
