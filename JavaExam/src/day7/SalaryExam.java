package day7;

import day5.MethodLab3;

class SalaryExpr {
	int bonus;

	SalaryExpr() {
		this(0);
		// bonus=0;

	}

	SalaryExpr(int bonus) {
		this.bonus = bonus;
	}

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

public class SalaryExam {

	public static void main(String[] args) {
		int month = MethodLab3.getRandom(12);
		int grade = (int) (Math.random() * 4) + 1;
		SalaryExpr sal1 = new SalaryExpr(100);
		SalaryExpr sal2 = new SalaryExpr();
		
		// 짝수달은 보너스달임
		if (month % 2 == 0) {

			System.out.printf("%d월 %d등급의 월급은 %d입니다.", month, grade, sal1.getSalary(grade));
		} else {

			System.out.printf("%d월 %d등급의 월급은 %d입니다.", month, grade, sal2.getSalary(grade));
		}
	}
}