package Z03_조건;

import java.util.Scanner;

public class IfElse7_Practice {
	/*
	 * 연도가 주어졌을때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성해라.
	 * 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐때 또는 400의 배수일 때이다.
	 * 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int year = 0;
		int result = 0;
		System.out.print("연도를 입력하세요: ");
		year = scanner.nextInt();
		
		if(year < 1 && year > 4000) {
			
			if(year % 4 ==0 && (year % 100 != 0 || year % 400 == 0)) {
				System.out.println(year + "년도는 윤년입니다.");
			}else {
				System.out.println(year + "년도는 윤년이 아닙니다.");
			}
			
			}else {
				
				System.out.println("연도는 1~4000까지 입력 할 수 있습니다.");
				
				
		}
		
		
		 
		
		

	}

}
