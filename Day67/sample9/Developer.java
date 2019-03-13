package sample9;

public class Developer {
	private String dept;
	private Emp emp;

	public Developer() {

	}

	public Developer(Emp emp) {
		super();
		this.emp = emp;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return emp.toString() + "부서 :" + dept + "(기술부)";
	}

}
