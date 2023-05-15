import java.util.Scanner;

public class CountAndSay {
    public static String countAndSay(int n) {
		String series = "1";//Start with the first series
		
		for(int i=1;i<n;i++) {
			StringBuilder nextSeries = new StringBuilder();
			int count=1;
			
			for(int j=1;j<series.length();j++) {
				if(series.charAt(j)==series.charAt(j-1)) {
					count++;
				}
				else {
					nextSeries.append(count).append(series.charAt(j-1));
					count = 1;
				}
			}
			nextSeries.append(count).append(series.charAt(series.length()-1));
			
			series = nextSeries.toString();
		}
		return series;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
		CountAndSay CountAndSay = new CountAndSay();
		String result = CountAndSay.countAndSay(n);
		System.out.println(result);
	}
    
}
