
public class Q3 {

	public static void main(String[] args) {
		//find sum up to n
		printsum(1,5,0);
	}
	public static void printsum(int i,int n,int sum) {
		if(i==n+1) {
			System.out.println(sum);
			return;
		}
		else {
			sum+=i;
			printsum(i+1,n,sum);
		}
	}
}
