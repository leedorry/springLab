package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	@Autowired
	//@Qualifier("apple")
	//@Resource(name = "apple")
	private Speaker speaker;

	public LgTV() {
		System.out.println("===> LgTV 객체 생성됨");
	}

	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void volumeUp() {
		//speaker.volumeUp();
		System.out.println("LgTV---소리 올린다.");
	}

	public void volumeDown() {
		//speaker.volumeDown();
		System.out.println("LgTV---소리 내린다.");
	}
}
