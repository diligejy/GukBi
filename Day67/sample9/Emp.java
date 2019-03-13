package sample9;

public class Emp {
	private String name;
	private int salary;

	public Emp() {

	}

	public Emp(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + "]";
	}

}
