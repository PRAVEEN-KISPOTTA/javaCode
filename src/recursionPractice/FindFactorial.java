package recursionPractice;

import java.util.Scanner;

public class FindFactorial {
	
	public static int factorial(int num) {
		if (num ==0) {
			return 1;
		}
		
		int result =  num * factorial(num -1);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fact = factorial(sc.nextInt());
		System.out.println(fact);
		sc.close();
		

	}

}
