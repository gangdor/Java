package day12;
import java.util.*;
public class GenerisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("java");
		list.add(100);
		list.add("servlet");
		list.add("jdbc");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		for(Object value : list){
			//String s = (String)value;
			System.out.println(value);
		}
		System.out.println();
		
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			String s = (String)iter.next();
			System.out.println(s);
		}
		
	}

}
