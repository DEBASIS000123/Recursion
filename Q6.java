
public class Q6 {

	public static void main(String[] args) {
		//Find sum up to n
		System.out.println(findsum(5));
	}
	public static int findsum(int n) {
		if(n==0) {
			return 0;
		}
		else {
			return n+findsum(n-1);
		}
	}
}
