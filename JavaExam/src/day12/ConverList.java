package day12;
import java.util.*;

public class ConverList {
	public ArrayList<Integer> converList(int array[]){
		/*for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}*/
		ArrayList<Integer> list = new ArrayList<Integer>(array.length);
		
		for (int i = array.length-1; i >= 0; i--) {
			list.add(array[i]);
		}
		return list;
		
	}
	
}
