package sample7;

import java.io.IOException;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private String phone;
	private Outputter outputter;

	public MessageBeanImpl(String name) {
		super();
		this.name = name;
	}

	@Override
	public void helloCall() {// 쓰기 작업
		String message = name + ":" + phone;
		try {
			outputter.output(message);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}

}
