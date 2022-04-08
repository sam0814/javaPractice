package Z06_클래스연습2;

public class Phone {
	private int phoneType;
	private String phoneModel;
	private int phoneColor;
	
	
	public int getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(int phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneModel() {
		return phoneModel;
	}

	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}

	public int getPhoneColor() {
		return phoneColor;
	}

	public void setPhoneColor(int phoneColor) {
		this.phoneColor = phoneColor;
	}

	
	public void PowerOn() {
		System.out.println(phoneModel + "의 전원을 켭니다.");
	}
	
	public void PowerOff() {
		System.out.println(phoneModel + "의 전원을 끕니다.");
	}
	
	public void showPhoneInfo() {
		System.out.println("휴대폰 타입: " + (phoneType == 1 ? "feature-phone" : "smart-phone"));
		System.out.println("휴대폰 모델: " + phoneModel);
		System.out.println("휴대폰 색상: " + (phoneColor == 1 ? "블랙" : phoneColor == 2 ? "화이트" : phoneColor == 3 ? "블루" : "레드"));
	}

}
