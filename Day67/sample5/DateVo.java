package sample5;

public class DateVo {
	private String name;
	private String birth;

	public DateVo() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", birth=" + birth + "]";
	}

}
