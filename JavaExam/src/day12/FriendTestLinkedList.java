package day12;
import java.util.*;
import day8.Friend;

public class FriendTestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend f[] = new Friend[5];
		f[0] = new Friend("������", "010-4824-6578", "hjm6578@naver.com");
		f[1] = new Friend("������", "010-7287-1237", "jjy1237@naver.com");
		f[2] = new Friend("������", "010-7891-3157", "kth3157@naver.com");
		f[3] = new Friend("������", "010-6328-1985", "shg1985@naver.com");
		f[4] = new Friend("����", "010-5332-6549", "kkm6549@naver.com");
		
		LinkedList<Friend> list = new LinkedList<Friend>();
		//Iterator<Friend> iterator = list.iterator();
		
		list.add(f[0]);
		list.add(f[1]);
		list.add(f[2]);
		list.add(f[3]);
		list.add(f[4]);
		
		//System.out.println(list.get(0).getInfo());
		
		/*for (int i = 0; i < f.length; i++) {
			System.out.println(list.get(i).getInfo());
		}*/
		
		for(Friend fr : list){
			System.out.println(fr.getInfo());
		}
		
		Iterator<Friend> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().getInfo());
		}
		
		
	}

}

