import java.util.Scanner;
public class Q12 {
	public static boolean isprime(int n,int i) {
		
		if(i==(int)Math.sqrt(n)+1) {
			return true;
		}
		else if(n%i==0) {
			return false;
		}
		else {
			return isprime(n,i+1);
		}
		
	}
	
	public static void main(String[] args) {
		//To check a number is prime number or not.
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(isprime(n, 2));
	}

}
