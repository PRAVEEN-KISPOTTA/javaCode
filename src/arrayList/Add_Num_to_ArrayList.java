package arrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Add_Num_to_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
		//add element
		list.add(8);
		list.add(3);
		list.add(74);
		list.add(5);
		System.out.println(list);
		
		//get element
		int val = list.get(2);
		System.out.println(val);
		
		//element add in between
		list.add(1, 89);
		System.out.println(list);
		
		//set element
		list.set(1, 4);
		System.out.println(list);
		
		//delete element
		list.remove(1);
		System.out.println(list);
		
		//size of the element
		int len = list.size();
		System.out.println(len);
		
		//loop
		for(int i = 0; i<list.size(); i++) {
			System.out.println("list - " + list.get(i));
		}
		
		//sorting
		Collections.sort(list);
		System.out.println(list);
	}

}
