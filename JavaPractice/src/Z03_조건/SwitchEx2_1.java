package Z03_조건;

import java.util.Scanner;

public class SwitchEx2_1 {
	/*
	 * score = 85
	 * 90~100  A
	 * 80 ~ 89 B
	 * 70 ~ 79 C
	 * 60 ~ 69 D
	 * 0 ~ 59  F
	 */

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		
		System.out.println("성적을 입력하세요: ");
		scanner.nextInt();
		
		switch (score / 10) {
		
		case 10:
		case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			break;
		default :
			System.out.println("F");
		}

	}

}
