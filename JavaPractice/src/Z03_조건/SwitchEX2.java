package Z03_조건;

import java.util.Scanner;

public class SwitchEX2 {
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
		
		switch(score < 0 || score > 100 ? 0 :score > 89 ? 1 : score > 79 ? 2 : score > 69 ? 3 : 
						score > 59 ? 4 : 0) {
		
		case 0 :
			System.out.println("0~100까지 숫자만 넣을 수 있습니다.");
			break;
		case 1 :
			System.out.println("A 등급입니다.");
			break;
		case 2 :
			System.out.println("B 등급입니다.");
			break;
		case 3 : 
			System.out.println("C 등급입니다.");
			break;
		case 4 :
			System.out.println("D 등급입니다.");
			break;
			default :
				System.out.println("F 등급입니다.");
			
		}
		
	}

}
