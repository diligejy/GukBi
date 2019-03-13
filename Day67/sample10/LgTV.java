package sample10;

public class LgTV implements TV {
	public LgTV() {
		
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
