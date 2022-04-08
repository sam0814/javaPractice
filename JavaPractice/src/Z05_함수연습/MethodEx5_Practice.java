package Z05_함수연습;

import java.util.Scanner;

public class MethodEx5_Practice {
	
	public static int sum(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		/*
		 * 두 수를 입력 받고 두 수의 합을 구하는 메서드를 구현하라.
		 * sum()
		 * return 두 수의 합
		 * 
		 * 리턴 된 수를 main 메서드에서 출력하라.
		 */
		
		Scanner scanner = new Scanner (System.in);
		int x =0, y =0;
		System.out.print("두 수를 입력하세요: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		System.out.println(sum(x , y));

	}

}
