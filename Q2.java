
public class Q2 {

	public static void main(String[] args) {
		//print numbers from 1 to 5
		int n=1;
		printnum(1);
	}
	public static void printnum(int n) {
		if(n==6) {
			return;
		}
		else {
			System.out.println(n);
			printnum(n+1);
		}
	}
}
