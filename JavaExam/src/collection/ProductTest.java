package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashSet<Product> set = new HashSet<Product>();
		Product p1 =new Product("p100", "TV      ", 20000); 
		Product p2 =new Product("p200", "Computer", 10000);
		Product p3 =new Product("p100", "MP3 ", 700);
		Product p4 =new Product("p300", "Audio    ", 1000);*/
		
		TreeSet <Product> tree = new TreeSet<Product>();
		Product p1 =new Product("p100", "TV      ", 20000); 
		Product p2 =new Product("p200", "Computer", 10000);
		Product p3 =new Product("p100", "MP3       ", 7000);
		Product p4 =new Product("p300", "Audio    ", 1000);
		tree.add(p1);
		tree.add(p2);
		tree.add(p3);
		tree.add(p4);
		
		Object t[] = tree.toArray();
		System.out.println("제품 ID"+"\t\t"+"제품명"+"\t"+"\t"+"가격");
		System.out.println("------------------------------------");
		Arrays.sort(t);
		Iterator<Product> it = tree.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		/*set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);*/
		
		/*for (int j = 0; j < p_array.length; j++) {
			if(set.add(p_array[j])){
				System.out.println("성공");
			}
			else
				System.out.println("실패");
		}*/
		
	}
}
