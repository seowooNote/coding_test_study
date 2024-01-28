package codingtest.ct.week01;

public interface RemoteControl {
	// 인터페이스
	// 상수 선언(변수는 선언 안됨)
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUE = 0; // 상수 선언 자동으로 되어 있음
	int volume = 0; // super
	
	// 추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
