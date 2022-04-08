package Z04_반복연습;

import java.util.Scanner;

public class GugudanInputPractice2 {
	/*
	 * 1.몇단부터 몇단까지 출력 할 것인지 입력
	 * startIndex = 5
	 * endIndex = 8;
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int startIndex =0;
		int endIndex = 0;
		System.out.print("시작 단을 입력해주세요: ");
		startIndex = scanner.nextInt();
		System.out.println("마지막 단을 입력해주세요: ");
		endIndex = scanner.nextInt();
		

		for(int i =startIndex; i < (endIndex + 1); i++) {
			
			System.out.println(i + "단");
			for(int j = 0; j < 9;) {
				System.out.println(i + "X" + (++j) + "=" + (i * j));
			}
			System.out.println();
		}
		

	}

}
