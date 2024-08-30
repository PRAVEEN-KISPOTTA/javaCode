package recursionPractice;

public class ReverseString {
	
	public static void reverse(String str, int i, int n) {
		
		if (i>n) {
			return;
		}
		char ch[] = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[n];
		ch[n] = temp;
		i++;
		n--;
		
		
		
		//String ans = new String(ch);
		
		//str = ans;
		reverse(str, i, n);
		System.out.println(ch);
	}
	
	public static String reverseString(String str) {
		reverse(str, 0, str.length()-1);
		return str;
		
	}
	public static void main(String[] args) {
		String str = "abcde";
//		for (int i = 0; i<str.length(); i++) {
//			System.out.print(str.charAt(str.length()-i-1)+" ");
//		}
		reverseString(str);
		
		
		

	}

}
