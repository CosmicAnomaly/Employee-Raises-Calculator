
public class Employee_Test {

	public static void main(String[] args) {
		
		Employee employee1;
		Employee employee2;
		
		employee1 = new Employee ("John", "Doe", 2500.00);
		employee2 = new Employee ("Jane", "Doe", 7500.00);
		
		
		System.out.printf("Employee %s %s has a yearly salary of $%.2f.\n", employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
		System.out.printf("Employee %s %s has a yearly salary of $%.2f.\n", employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());
		System.out.printf("With a 10 percent raise %s has a yearly salary of $%.2f.\n", employee1.getFirstName(), employee1.getRaisedSalary());
		System.out.printf("With a 10 percent raise %s has a yearly salary of $%.2f.\n", employee2.getFirstName(), employee2.getRaisedSalary());
	}

}
