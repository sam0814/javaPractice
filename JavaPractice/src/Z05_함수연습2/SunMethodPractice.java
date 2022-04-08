package Z05_함수연습2;

public class SunMethodPractice {
	public static int test(int money) {
		System.out.println(money);
		System.out.println(money + "를 굴린다.");
		System.out.println("테스트 출력");
		return money * 2;
	}

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println(test(10000));
		System.out.println("2");

	}

}
