package fraz_DSA;

import java.util.*;
public class Two_out_of_three {
	
	public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList();
        int arr1[] = new int[101];
        int arr2[] = new int[101];
        int arr3[] = new int[101];

        for (int i = 0; i<=100; i++){
        	
        	if(nums1.length > i) {
        		arr1[nums1[i]] = 1;
        	}
            if(nums2.length > i) {
            	arr2[nums2[i]] = 1;
        	}
            if(nums3.length > i) {
            	arr3[nums3[i]] = 1;
        	} 
            
        }

        for (int i = 0; i<=100; i++){
//            if ((arr1[i] != 0 && arr2[i] != 0) || (arr2[i] != 0 && arr3[i] != 0) || (arr1[i] != 0 && arr3[i] != 0)) {
//        	ans.add(i);
//        }
        	
        	if (arr1[i] + arr2[i] + arr3[i] >= 2) {
        		ans.add(i);
        	}
        	
    }
    return ans;
    }

	public static void main(String[] args) {
		int arr1[] = {1, 1, 3, 2};
		int arr2[] = {2, 3};
		int arr3[] = {3};
		
		System.out.println(twoOutOfThree(arr1, arr2, arr3));

	}

}
