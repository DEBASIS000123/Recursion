
public class Q9 {

	public static void main(String[] args) {
		// Find GCD of two numbers.
		System.out.println(findgcd(5,10));
	}
	public static int findgcd(int x,int y) {
		if(y==0) {
			return x;
		}
		else {
			return findgcd(y,x%y);
		}
	}
}
