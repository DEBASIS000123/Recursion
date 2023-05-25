
public class Q7 {

	public static void main(String[] args) {
		// find the product of x*y
		System.out.println(findproduct(10,20));
	}
	public static int findproduct(int x,int y) {
		if(x==0||y==0) {
			return 0;
		}
		else {
			return x+findproduct(x,y-1);
		}
	}
}
