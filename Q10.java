
public class Q10 {
	public static void printfibo(int a,int b,int n) {
		if(n==0) {
			return;
		}
		int c=a+b;
		System.out.print(c+" ");
		printfibo(b,c,n-1);
		
		
	}
	public static void main(String[] args) {
		//Print fibonacci series
		int a=0;
		int b=1;
		int n=5;
		System.out.print(a+" "+b+" ");
		//System.out.println(b);
		printfibo(a,b,n-2);
	}

}
