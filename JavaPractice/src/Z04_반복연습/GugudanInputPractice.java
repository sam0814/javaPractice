package Z04_반복연습;

import java.util.Scanner;

public class GugudanInputPractice {

	public static void main(String[] args) {
		/*
		 * 몇단 부터 몇단 까지 출력 할 것 인지 입력
		 * start index:5
		 * end index:8
		 */
		
		Scanner scanner = new Scanner(System.in);
			
			int startIndex = 0;
			int endIndex = 0;
			
			System.out.print("시작 단을 입력하세요: ");
			startIndex = scanner.nextInt();
			System.out.print("마지막 단을 입력하세요: ");
			endIndex = scanner.nextInt();
		/*
		for(int i = startIndex; i < (endIndex + 1) ; i++) {
			
			System.out.println(i + "단");
			
		for(int j =0; j < 9; ) {
				System.out.println(i + "X" + (++j) + "=" + (i * j));
			}
			System.out.println();
		}
		*/
			int i = startIndex;
			
			while(i < endIndex + 1) {
				
					System.out.println(i + "단");
					int j = 0;
					while(j < 9) {
					System.out.println(i + "X" + (++j) + "=" + (i * j));
				}
				System.out.println();
				i++;
			}
	}
}


