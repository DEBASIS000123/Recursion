
public class Q8 {

	public static void main(String[] args) {
		// Find X^Y
		System.out.println(findxy(3,4));

	}
	public static int findxy(int x,int y) {
		if(x==0) {
			return 0;
		}
		else if(y==0) {
			return 1;
		}
		else {
			return x*findxy(x,y-1);
		}
	}
}
