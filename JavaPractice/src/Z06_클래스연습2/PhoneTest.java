package Z06_클래스연습2;
/**
 * 
 * 속성
 * phoneType(int) 1:feature-phone, 2 :smart-phone
 * phoneModel
 * phoneColor(int) 1: 블랙, 2: 화이트, 3: 블루, 4:레드
 * 
 * 기능
 * powerOn()
 * phoneModel의 전원을 켭니다.
 * powerOff()
 * phoneModel의 전원을 끕니다.
 * showPhoneInfo()
 * 휴대폰 타입: feature-phone, smart-phone
 * 휴대폰 모델: 롤리팝, 고아라폰, 아이폰, 갤럭시
 * 휴대폰 색상: 블랙,화이트,블루,레드
 * 
 * addPhone(int type, String model, int color);
 * 리턴은 객체(주소값)
 */

public class PhoneTest {
	
	public static Phone addPhone(int type, String model, int color) {
		Phone phone = new Phone();
//		phone.setPhoneType(type);
//		phone.setPhoneModel(model);
//		phone.setPhoneColor(color);
		return phone;
	}

	public static void main(String[] args) {
		
		Phone p1 = addPhone(1, "고아라폰", 2);
		p1.showPhoneInfo();
		p1.PowerOn();
		p1.PowerOff();
	
		
		
		
		
		
		

	}

}
