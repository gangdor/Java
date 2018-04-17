package day12;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int array[] = {3,4,2,5,2,3,6,7,5,7,9};
		ConverList cl = new ConverList();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list= cl.converList(array);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
