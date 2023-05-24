
public class Q5 {

	public static void main(String[] args) {
		//Find factorial of given number-2.
		System.out.println(findfact(5));
	}
	public static int findfact(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*findfact(n-1);
		}
	}

}
