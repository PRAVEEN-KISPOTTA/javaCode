package fraz_DSA;

import java.util.*;
public class Initialize_0 {
	
	public static int[] runningNumber(int arr[]) {
		
		int newArr[] = new int[20];
		for (int i = 0; i<arr.length; i++) {
			newArr[arr[i]]++;
		}
		
		int ans = 0;
		for (int i = 0; i<newArr.length; i++) {
			ans += ((newArr[i]-1) * newArr[i])/2;
			
		}
		System.out.println("Number of pairs: " + ans);
		return newArr;
	}

	public static void main(String[] args) {
		int arr[] = {2, 3, 2, 4, 3, 7, 4, 3, 8, 6, 10, 10, 16};
		//System.out.print(runningNumber(arr));
		
		int ans[] = runningNumber(arr);
		System.out.println("Count the index number:");
		for (int i = 0; i<20; i++) {
			System.out.print(ans[i] + " ");
		}
		

	}

}
