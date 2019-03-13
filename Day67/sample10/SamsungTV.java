package sample10;

public class SamsungTV implements TV {
	public SamsungTV() {

	}

	@Override
	public void powerOn() {
		System.out.println("SAMSUNGTV --- 전원을 켠다");
	}

	@Override
	public void powerOff() {
		System.out.println("SAMSUNGTV --- 전원을 끈다");
	}

	@Override
	public void volumnUp() {
		System.out.println("SAMSUNGTV --- 소리를 높인다");
	}

	@Override
	public void VolumnDown() {
		System.out.println("SAMSUNGTV --- 소리를 낮춘다");
	}

}
