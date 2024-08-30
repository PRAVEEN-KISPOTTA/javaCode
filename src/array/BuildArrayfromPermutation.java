package array;

import java.util.Arrays;

public class BuildArrayfromPermutation {
	
	public static int[] print(int nums[]) {
		
		int n = nums.length;
		int[] arr = new int[n];
		for (int i = 0; i<nums.length; i++) {
			arr[i] = nums[nums[i]];
		}
		return arr;
//		System.out.println(nums);
	}

	public static void main(String[] args) {
		int[] nums = {0,2,1,5,3,4};
		int[] result = print(nums);
		System.out.println(Arrays.toString(result));
//		print(nums);

	}

}
