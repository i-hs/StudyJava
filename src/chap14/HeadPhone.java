package chap14;

public class HeadPhone implements Wearable{
	int volume =0;  
	
	public void putOn() {
		System.out.println("헤드폰을 착용했습니다.");
	}
	public void putOff() {
		System.out.println("헤드폰을 벗었습니다.");
	}
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("볼륨을 "+volume+"로 변경했습니다.");
	}
}
