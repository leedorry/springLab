package polymorphism;

public class TVUserPolymorphism {
	public static void main(String[] args) {

		TV tv = new SamsungTV();  // 자동형변환, 인터페이스 = 구현 객체
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

		tv = new LgTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

	}
}
