
package fraz_DSA;

import java.util.*;

public class print_without_pair {
	
	public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
//        int n = nums[nums.length-1];
//        int arr[] = new int[n+1];
//        for (int i = 0; i<nums.length; i++){
//            arr[nums[i]]++;
//        }
//
//        int ans = 0;
//        for (int i = 0; i<arr.length; i++){
//            if(arr[i] == 1){
//                ans = i;
//            }
//        }
//        return ans;
        
        int ans = 0;
        
        for (int i = 0; i<nums.length; i++) {
        	ans ^=nums[i];
        }
        return ans;
	}

	public static void main(String[] args) {
		int arr[] = {4, 1, 2, 1, 4, 8, 2};
		System.out.println(singleNumber(arr));

	}

}
