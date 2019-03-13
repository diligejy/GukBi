package sample6;

public class Developer extends Emp {
	private String dept;

	public Developer() {

	}

	public Developer(String name, int salary, String dept) {
		super(name, salary);
		this.dept = dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + "부서 :" + dept + "(개발부)";
	}

}
