import java.util.Scanner;

public class ReverseInteger {
    public int reverseInteger(int n){
        int rev = 0;

       while(n!=0) {
    	   rev = rev*10+n%10;
    	   n=n/10;
       }
       if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE)
    	   return 0;
       
        return (int)rev;
    }
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
		ReverseInteger ReverseInteger = new ReverseInteger();
		int result = ReverseInteger.reverseInteger(n);
		System.out.println(result);
        
    }
}