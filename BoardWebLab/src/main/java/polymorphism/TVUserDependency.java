package polymorphism;

public class TVUserDependency {
	public static void main(String[] args) {

		TV tv = new SamsungTVDependency();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

	}
}
