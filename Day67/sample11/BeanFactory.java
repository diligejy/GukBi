package sample11;

public class BeanFactory {
//Factory Pattern : Bean들의 객체를 식별할 수 있는 이름, id를 받아서 관리하는 객체를 팩토리 패턴을 구현한다고 한다. 객체 생성후 Object로 리턴하는 메소드를 정의가 되어야 한다.
	public Object getBean(String beanName) { // ApplicationContext의 getBean()
		if (beanName.equals("samsung")) {
			return new SamsungTV();
		} else if (beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
	}
}
