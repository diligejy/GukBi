package sample1;

public class MessageBeanImpl implements MessageBean {

	private String message;
	private String id;

	public MessageBeanImpl() {
		this.message = "spring exec";
		this.id = "a1111";

	}

	public MessageBeanImpl(String message, String id) {
		this.message = message;
		this.id = id;
	}

	@Override
	public void Prn() {
		System.out.println("MessageBeanImpl");
		System.out.println(this.message + ":" + this.id);
	}

}
