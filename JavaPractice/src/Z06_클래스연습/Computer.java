package Z06_클래스연습;

public class Computer {
	String model; //변수 존재
	
	//생성자 존재
	public Computer() {
		System.out.println("컴퓨터 객체를 생성합니다.");
	}
	
	//메소드 존재
	public void PrintInfo() {
		System.out.println("컴퓨터 모델: " + model);
	}

}
