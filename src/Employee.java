
public class Employee {
	
	private String firstName;
	private String lastName;
	private double monthlySalary;
	private double yearlySalary;
	private double raisedSalary;
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}

	public double getYearlySalary() {
		yearlySalary = (monthlySalary * 12);
		return yearlySalary;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;	
	}

	public double getRaisedSalary() {
		raisedSalary = ((monthlySalary * 12 * .10) + monthlySalary * 12);
		return raisedSalary;
	}
	//I tried using yearlySalary * 10 + yearlySalary but for some reason the code wouldn't recognize yearlySalary
	//I can only assume this has something to do with the way the vale is set for yearlySalary
	//I experimented a lot with it and could not get it to work. 
	public void setRaisedSalary(double raisedSalary) {
		this.raisedSalary = raisedSalary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary > 0.00)
		this.monthlySalary = monthlySalary;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
