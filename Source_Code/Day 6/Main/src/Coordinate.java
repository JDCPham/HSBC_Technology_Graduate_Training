
public class Coordinate {
	
	public static String unit;
	
	private int x;
	private int y;
	
	public Coordinate(int a, int b) {
		x = a;
		y = b;
	}
	
	public void print() {
		System.out.println(x + "," + y);
	}

}
