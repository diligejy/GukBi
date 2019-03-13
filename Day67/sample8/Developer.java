package sample8;

public class Developer {
	private String dept;
	private Emp emp;

	public Developer() {

	}

	public Developer(Emp emp, String dept) {
		super();
		this.dept = dept;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return emp.toString() + "�μ� :" + dept + "(�����)";
	}

}
