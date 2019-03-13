package sample11;

public class LgTV implements TV {
	public LgTV() {
		System.out.println("LGTV 객체가 생성되었어요");
	}

	@Override
	public void powerOn() {
		System.out.println("LGTV --- 전원을 켠다");
	}

	@Override
	public void powerOff() {
		System.out.println("LGTV --- 전원을 끈다");
	}

	@Override
	public void volumnUp() {
		System.out.println("LGTV --- 소리를 높인다");
	}

	@Override
	public void VolumnDown() {
		System.out.println("LGTV --- 소리를 낮춘다");
	}

}
