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
		return emp.toString() + "�μ� :" + dept + "(���ߺ�)";
	}

}
