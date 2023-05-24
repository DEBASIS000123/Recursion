
public class Q1 {

	public static void main(String[] args) {
		//print numbers from 5 to 1
		int n=5;
		printnum(5);
	}
	public static void printnum(int n) {
		if(n==0) {
			return;
		}
		else {
		System.out.println(n);
		printnum(n-1);
		}
	}
}
