package sample11;

public class BeanFactory {
//Factory Pattern : Bean���� ��ü�� �ĺ��� �� �ִ� �̸�, id�� �޾Ƽ� �����ϴ� ��ü�� ���丮 ������ �����Ѵٰ� �Ѵ�. ��ü ������ Object�� �����ϴ� �޼ҵ带 ���ǰ� �Ǿ�� �Ѵ�.
	public Object getBean(String beanName) { // ApplicationContext�� getBean()
		if (beanName.equals("samsung")) {
			return new SamsungTV();
		} else if (beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
	}
}
