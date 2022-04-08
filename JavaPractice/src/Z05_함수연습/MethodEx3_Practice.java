package Z05_함수연습;

import java.util.Scanner;

public class MethodEx3_Practice {
	
	public static void printstar(int startCount) {
		if(startCount < 1) {
			System.out.print("별의 개수는 1개 이상을 입력 하셔야 합니다.");
		}else {
		for(int i =0; i < startCount; i++) {
			for(int j = 0; j < startCount-i-1; j++) {
					System.out.print(" ");
				}
				for(int j = 0;  j < (i * 2) + 1 ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * printstar(입력받은 별의 개수)
		 * 1보다 작은 음수가 들어왔을 때, 
		 * 별의 개수는 1개 이상을 입력 하셔야합니다.
		 */
		Scanner scanner = new Scanner(System.in);
		int n =0;
		
		System.out.println("반복 횟수 입력: ");
		n = scanner.nextInt();
		
		printstar(n);

	}

}
