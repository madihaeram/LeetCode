import java.util.Scanner;

public class PalindromeNumber {
    public boolean palindromeNumber(int n){
		if(n<0||(n%10==0&&n!=0)) {
			return false;
		}
		int rev=0;
		while(n>rev) {
			rev=rev*10+n%10;
			n/=10;
		}
		return true;
    }
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        int n = 10;
		PalindromeNumber Solution = new PalindromeNumber();
		boolean result = Solution.palindromeNumber(n);
		
		System.out.print(result);
		
    }
    
}
