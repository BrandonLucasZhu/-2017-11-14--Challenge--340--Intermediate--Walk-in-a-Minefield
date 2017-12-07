
public class Point {
	
	 private int x, y;
	 private String tile; 
	 
	 public Point(int i, int j, String tile) {
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
	 
	 public void setX(int i) {
		 x=i; 
	 }
	 
	 public void setY(int j) {
		 y=j; 
	 }
	 
	 public String getType() {
		 return tile; //Returns the type of tile
	 }
	 
	 
}
