package array;

import java.util.Scanner;

public class LargestNum {
	
	public static int[] takeInput() {
       Scanner sc = new Scanner(System.in);
		
		System.out.println("enter length");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0; i<num; i++) {
			System.out.println("enter " + i + " index");
			arr[i] = sc.nextInt();
		}
		return arr;
		
		
	}
	
	
	// 4 5 2 6 7 8
	public static int largest(int arr[]) {
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		int[] arr = takeInput();
		int largest = largest(arr);
		System.out.println(largest);
		
	}

}
