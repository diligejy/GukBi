package sample10;

public class MTest {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBean("samsung");
		tv.powerOn();
		tv.volumnUp();
		tv.VolumnDown();
		tv.powerOff();
	}
}
