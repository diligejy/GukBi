package sample10;

public class LgTV implements TV {
	public LgTV() {
		
	}

	@Override
	public void powerOn() {
		System.out.println("LGTV --- ������ �Ҵ�");
	}

	@Override
	public void powerOff() {
		System.out.println("LGTV --- ������ ����");
	}

	@Override
	public void volumnUp() {
		System.out.println("LGTV --- �Ҹ��� ���δ�");
	}

	@Override
	public void VolumnDown() {
		System.out.println("LGTV --- �Ҹ��� �����");
	}

}
