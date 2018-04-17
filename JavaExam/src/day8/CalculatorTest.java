package day8;

import java.util.Scanner;

class CalculatorExpr{
	int num1;
	int num2;
	
	CalculatorExpr(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	int getAddition(){
		return num1+num2;
	}
	int getSubtraction(){
		return num1-num2;
	}
	int getMultiplication(){
		return num1*num2;
	}
	double getDivision(){
		return (double)num1/(double)num2;
	}
	
}

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner oneMore = new Scanner(System.in);
		boolean again = true;
		int n1,n2;
		CalculatorExpr c1;
		String x;
		
		while(again){
			
		System.out.print("������ ���� 2���� �Է����ֽð� :");
		
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		c1 = new CalculatorExpr(n1, n2);
		System.out.printf("����� ���� : %d, %d %n", n1, n2);
		PrintOperations(c1);
		System.out.print("��� �Ͻðڼ�?(y/n)");
		
		x = oneMore.next();
		
		if(x.charAt(0)=='y'){
			again=true;
		}
		else if(x.charAt(0)=='n')
			{
			again = false;
			System.out.println("���α׷� ����");
			
			}	
		
		}
		oneMore.close();
		scan.close();
	}
	
	public static void PrintOperations(CalculatorExpr c){
		System.out.printf("���� : %d%n", c.getAddition());
		System.out.printf("���� : %d%n", c.getSubtraction());
		System.out.printf("���� : %d%n", c.getMultiplication());
		System.out.printf("������ : %f%n", c.getDivision());
	}

}
