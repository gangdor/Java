package emp;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee[] = new Employee[2];
		Secretary sec = new Secretary("Duke", 1, "secretary", 800);
		Sales sal = new Sales("Tuxi", 2, "sales    ", 1200);
		employee[0] = sec;
		employee[1] = sal;
		printEmployee(employee, false);
		System.out.println();
		System.out.println("인센티브 100 지급");
		System.out.println();
		sec.incentive(100);
		sal.incentive(100);
		
		/*((Bonus)employee[0]).incentive(100); // 이렇게 표현해도 됌
*/		
		printEmployee(employee, true);

	}

	public static void printEmployee(Employee emp[], boolean isTax) {
		if (isTax) {
			System.out.println("name" + "\t" + "\t" + "department" + "\t" + "salary" + "\t" + "\t" + "tax");
			System.out.println("--------------------------------------------------------------");
			for (int i = 0; i < emp.length; i++) {
				System.out.println(emp[i].getName() + "\t" + "\t" + emp[i].getDepartment() + "\t" + emp[i].getSalary()
						+ "\t" + "\t" + emp[i].tax());
			}
		} else {
			System.out.println("name" + "\t" + "\t" + "department" + "\t" + "salary");
			System.out.println("-----------------------------------------------");
			for (int i = 0; i < emp.length; i++) {
				System.out.println(emp[i].getName() + "\t" + "\t" + emp[i].getDepartment() + "\t" + emp[i].getSalary());
			}
		}

	}
}
