package Z06_클래스연습;

public class Car {
	
	String company;
	String model;
	int oil;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Car(String company, String model, int oil) {
		super();
		this.company = company;
		this.model = model;
		this.oil = oil;
	}


	public void oilError() {
		System.out.println("기름이 부족하여 차량의 이동이 불가능 합니다.");
	}
	
	public void go() {
		if(oil < 1) {
			oilError();
		}else {
			oil--;
			System.out.println("기름이 1 감소하였습니다.");
		}
	
	}
	
	public void oiling() {
		oil++;
		System.out.println("기름이 1 증가하였습니다.");
	}
	
	public void showCarInfo() {
		System.out.println(company + " 회사에서 제조한 " + model + "차량의 정보");
		System.out.println("현재 기름은 " + oil + "리터 입니다.");
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", oil=" + oil + "]";
	}
}
