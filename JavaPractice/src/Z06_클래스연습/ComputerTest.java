package Z06_클래스연습;

public class ComputerTest {
	

	public static void main(String[] args) {
		
		Computer c1 = null;
		Computer c2 = null;
		
		c1 = new Computer();
		c2 = new Computer();//생성(생성자 호출)
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.model = "삼성컴퓨터";
		c2.model = "LG컴퓨터";
		
		System.out.println(c1.model);
		System.out.println(c2.model);
		
		c1.PrintInfo();
		c2.PrintInfo();

	}

}
