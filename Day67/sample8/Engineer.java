package sample8;

public class Engineer {
	private String dept;
	private Emp emp;

	public Engineer() {

	}

	public Engineer(Emp emp, String dept) {
		super();
		this.dept = dept;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return emp.toString() + "부서 :" + dept + "(개발부)";
	}

}
