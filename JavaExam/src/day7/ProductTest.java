package day7;
class Product{
	String name;
	int balance;
	int price;
	
	Product(){
		/*name="��ũ����";
		balance=5;
		price=10000;*/
		this("��ũ����",5,10000);
	}
	Product(String name, int balance, int price){
		this.name=name;
		this.balance=balance;
		this.price=price;
	}
	String getName(){
		return name;
	}
	int getBalance(){
		return balance;
	}
	int getPrince(){
		return price;
	}
}

public class ProductTest {

	public static void main(String[] args) {
		Product p0 = new Product();
		Product p1 = new Product("��ī������",20,15000);
		Product p2 = new Product("���α�����",10,16000);
		Product p3 = new Product("���̸�����",15,17000);
		Product p4 = new Product("�̺�������",25,18000);
		Product p_array[] = new Product[5];
		
		p_array[0]=p0;
		p_array[1]=p1;
		p_array[2]=p2;
		p_array[3]=p3;
		p_array[4]=p4;
		
		//p_array[0]=new Product("��ī��", 20, 15000);
		
		for (int i = 0; i < p_array.length; i++) {
			System.out.println(p_array[i].getName() +"\t\t"+ p_array[i].getBalance() +"\t" + p_array[i].getPrince());
		}
		
		/*for(Product j:p_array){
			System.out.println(j.getName());
		}*/
	}

}
