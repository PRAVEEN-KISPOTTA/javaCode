package recursionPractice;

public class Solution{
	public static boolean helper(String str, int s, int e){
	if(s>=e)
	return true;

	if(str.charAt(s) != str.charAt(e))
	return false;

	return helper(str, s+1, e-1);
   }
 	public static void main(String[] args){
        String str = "racecasr";
	boolean isPalindrome = helper(str, 0, str.length()-1);
	System.out.print(isPalindrome);
   }
}
