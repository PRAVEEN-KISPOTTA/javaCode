package fraz_DSA;

public class largestNumber {

	public static void main(String[] args) {
		int[] arr = {2, -3, 4, 1, 6, -5, 3, 9, 2, 7};
		
		int largestNumber = Integer.MIN_VALUE;
		int secondLargestNumber = 0;
		for (int i = 0; i<arr.length; i++) {
			
			if (largestNumber < arr[i]) {
				secondLargestNumber = largestNumber;
				largestNumber = arr[i];
			}else {
				secondLargestNumber = arr[i];
			}
		}
		System.out.println("First: " + largestNumber + "\nSecond: " + secondLargestNumber);

	}

}
