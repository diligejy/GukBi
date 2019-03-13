package sample6;

public class Emp {
	private String name;
	private int salary;

	public Emp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Emp() {
	}



	@Override
	public String toString() {
		return "[이름 =" + name + ", 급여 =" + salary + "]";
	}

}
