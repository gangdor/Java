package workshop6.exception;

class Account {
	private String account;
	private double balance;
	private double interestRate;

	public Account() {
	}

	public Account(String account, double balance, double interestRate) {
		setAccount(account);
		setBalance(balance);
		setInterestRate(interestRate);
	}
	
	@Override // �� ������ �־��ָ� �߰��� ���α׷��� ���� �� �ִ�. �޼��带 ���� �޼���� �����ش�. �ֳ����̼� ����
	public String toString(){
		return "�������� : "+ getAccount() + "  " + getBalance() + "  " + getInterestRate();
	}	
	
	public double calculateInterest() {
		// �ܾױ��� ���� ���
		return balance * interestRate*0.01;
	}

	public void deposit(double money) throws Exception {
		if (money > 0)
			balance += money;
		else
			throw new Exception("�Ա� �ݾ��� 0���� �����ϴ�.");
	}

	public void withdraw(double money) throws Exception {
		if (money < 0 || balance < money)
			throw new Exception("�ݾ��� 0���� ���ų� ���� �ܾ׺��� �����ϴ�.");
		else
			balance -= money;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account("441-0290-1203", 500000, 7.3);
		//System.out.println("�������� : " + ac.getAccount() + "  " + ac.getBalance() + "  " + ac.getInterestRate());
		System.out.println(ac.toString());
		
		try {
			ac.deposit(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			ac.withdraw(600000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���� : " + ac.calculateInterest());

	}

}
