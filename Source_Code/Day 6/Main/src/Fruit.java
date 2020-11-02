
public class Fruit {
	
	public void checkFuit() {
		int noOfApples = 3;
		if (noOfApples > 10) {
			Exception e = new Exception();
			throw e;
		}
	}

}
