package array;

public class Segregate_0_and_1 {
	private static int[] sortedArr(int[] arr) {
		int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            
            while (arr[start] == 0 && start < end) {
                start++;
            }
            
            while (arr[end] == 1 && start < end) {
                end--;
            }
            
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                
                start++;
                end--;
            }
        }
        return arr;
	}

	public static void main(String[] args) {
		int arr[] = {0, 1, 1, 1, 0, 1, 0, 1};
		int newArr[] = sortedArr(arr);
		
		for(int i : newArr) {
			System.out.print(i + " ");
		}
	}

}
