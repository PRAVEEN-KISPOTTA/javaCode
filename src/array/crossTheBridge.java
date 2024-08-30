package array;

import java.util.*;

public class crossTheBridge {
    public static int minTrips(int[] boxWeight, int carryCapacity, int maxWeight) {
        Arrays.sort(boxWeight);
        int trips = 0;
        int currentWeight = 0;

        for (int i = boxWeight.length - 1; i >= 0; ) {
            trips++;
            currentWeight = 0;

            // Load boxes onto the worker until the total weight reaches maxWeight or carryCapacity is reached
            while (i >= 0 && currentWeight + boxWeight[i] <= maxWeight && trips % carryCapacity != 0) {
                currentWeight += boxWeight[i];
                i--;
            }
        }

        return trips;
    }

    public static void main(String[] args) {
//        int[] boxWeight = {50, 100, 25, 75, 50};
//        int carryCapacity = 3;
//        int maxWeight = 200;
    	Scanner sc = new Scanner(System.in);
    	int size = sc.nextInt();
    	int[] boxWeight = new int[size];
    	
    	for(int i = 0; i<boxWeight.length; i++) {
    		boxWeight[i] = sc.nextInt();
    	}
    	
    	int carryCapacity = sc.nextInt();
    	int maxWeight = sc.nextInt();
;    	

        int result = minTrips(boxWeight, carryCapacity, maxWeight);
        System.out.println(result);
    }
}
