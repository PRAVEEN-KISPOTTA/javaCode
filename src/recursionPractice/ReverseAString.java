package recursionPractice;

public class ReverseAString {

	public static void main(String[] args) {
		String arr[] = {"a", "b", "c", "d", "e"};
		
		int i = 0, j = arr.length-1;
		while(i<j) {
			String a = arr[i];
			arr[i] = arr[j];
			arr[j] = a;
			i++;
			j--;
		}
		
		for (String element: arr) {
			System.out.print(element);
		}

	}

}
