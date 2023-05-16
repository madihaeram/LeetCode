import java.util.Scanner;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String []strs){
		if(strs.length==0) return "";
		String prefix = strs[0];
		for(int i=1;i<strs.length;i++) {
			while(strs[i].indexOf(prefix)!=0) {
				prefix = prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty()) return "";
			}
		}
		return prefix;
		
    }
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        String [] strs = {"fling","fliw","flight"};
		LongestCommonPrefix Solution = new LongestCommonPrefix();
		String result = Solution.longestCommonPrefix(strs);
		
		System.out.print(result);
		
    }
    
}
