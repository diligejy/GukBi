package sample11;

public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println("SAMSUNGTV ��ü�� �����Ǿ����");
	}

	@Override
	public void powerOn() {
		System.out.println("SAMSUNGTV --- ������ �Ҵ�");
	}

	@Override
	public void powerOff() {
		System.out.println("SAMSUNGTV --- ������ ����");
	}

	@Override
	public void volumnUp() {
		System.out.println("SAMSUNGTV --- �Ҹ��� ���δ�");
	}

	@Override
	public void VolumnDown() {
		System.out.println("SAMSUNGTV --- �Ҹ��� �����");
	}

}
