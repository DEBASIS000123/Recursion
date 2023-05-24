
public class Q4 {

	public static void main(String[] args) {
		//print factorial of a number n. 
		printfactorial(1,4,1);
	}
	public static void printfactorial(int i,int n,int fact) {
		if(i==n+1) {
			System.out.println(fact);
			return;
		}
		else {
			fact*=i;
			printfactorial(i+1,n,fact);
		}
	}
}
