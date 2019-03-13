package sample9;

public class Engineer {
	private String dept;
	private Emp emp;

	public Engineer() {

	}

	public Engineer(Emp emp) {
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
		return emp.toString() + "부서 :" + dept + "(개발부)";
	}

}
