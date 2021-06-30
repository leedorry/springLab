package polymorphism;

public class TVUserCoupling {
	public static void main(String[] args) {
		SamsungTVCoupling tv = new SamsungTVCoupling();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

		//tv = new LgTVCoupling();
		LgTVCoupling tv1 = new LgTVCoupling();
		tv1.turnOn();
		tv1.soundUp();
		tv1.soundDown();
		tv1.turnOff();
	}
}
