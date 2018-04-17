package practice;
import java.util.*;

public class BJ_11718 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		//System.out.println(scan.hasNextLine());
		while(scan.hasNextLine()) {//입력을 받으면.
			String input=scan.nextLine();
			if(input == null || input.isEmpty()){
				break;
			}
			a.add(input);
		}
		scan.close();
		
		for (int j = 0; j < a.size(); j++) {
			System.out.println(a.get(j));
		}
		
		
		
	}

}
