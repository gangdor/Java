package lab;
public class SalaryExpr {
	private int bonus;
	public SalaryExpr() {
		this(0);
	}
	public SalaryExpr(int bonus) {
		this.bonus = bonus;
	}
	public int getBonus() {
		return bonus;
	}/*
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}*/
	int getSalary(int grade) {
		int result = 0;

		switch (grade) {
		case 1:
			result = bonus + 100;
			break;
		case 2:
			result = bonus + 90;
			break;
		case 3:
			result = bonus + 80;
			break;
		case 4:
			result = bonus + 70;
		}
		return result;
	}
}