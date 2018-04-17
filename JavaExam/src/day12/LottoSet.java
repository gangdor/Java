package day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class LottoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		HashSet<Integer> set = new HashSet<Integer>();

		while(set.size()<10){
			set.add(random.nextInt(21)+10);
		}
		System.out.print("오늘의 로또 번호 : ");
		
		Iterator<Integer> iterator = set.iterator();
		int i =0;
		while(iterator.hasNext()){
			//int a = iterator.next();
			//System.out.print(a);
			if(i==9) System.out.print(iterator.next());
			else System.out.print(iterator.next() + ", ");
			i++;
		}
		System.out.println();
		System.out.println(set);
	}

}
