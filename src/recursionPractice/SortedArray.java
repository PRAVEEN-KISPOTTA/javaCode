package recursionPractice;

public class SortedArray {
	
	public static boolean sortedArray(int arr[], int n) {
		
		System.out.println(arr[n]);
		
		if (n==0 || n==1) {
			return true;
		}
		
		if (arr[n] < arr[n-1]) {
			return false;
		}
		else {
			boolean ans = sortedArray(arr, n-1);
			return ans;
		}
	}

	public static void main(String[] args) {
		int arr[] = {0, 2, 9, 3, 4, 4, 5, 6};
		int n = arr.length-1;
		boolean result = sortedArray(arr, n);
		System.out.println(result);

	}

}
