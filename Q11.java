
public class Q11 {
	public static String tobin(int n,String bin) {
		if(n==0) {
			return bin;
		}
		else {
			return tobin(n/2,(n%2)+bin);
		}
	}
	public static void main(String[] args) {
		//Binary equivalent of a given number;
		String bin=tobin(3," ");
		System.out.println(bin);
	}

}
