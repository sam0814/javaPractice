package Z05_함수연습;

import java.util.Scanner;

public class MethodEx4_Practice {
	
	public static void printStar1(int startCount) {
		for(int i = 0; i < startCount; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < startCount - i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
			
	}
		public static void printStar2(int startCount) {
			if(startCount < 1) {
				System.out.println("별의 개수는 1개 이상을 입력 하셔야 합니다.");
			}
			for(int i =0; i < startCount; i++) {
				for(int j = 0; j < startCount-i-1; j++) {
						System.out.print(" ");
					}
					for(int j = 0; j < i + 1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
		}
		public static void printStar3(int startCount) {
			
		}
	public static void printStar4(int startCount) {
		
	}
	public static void printStar5(int startCount) {
		
	}
	
		public static void main(String[] args) {
		/*
		 * printstar(입력받은 별의 개수)
		 * 1보다 작은 음수가 들어왔을 때, 
		 * 별의 개수는 1개 이상을 입력 하셔야합니다.
		 * 
		 * 반복 횟수 입력:10
		 * 별찍기 모양 선택(1 ~ 5):
		 * 만약 1 ~ 5의 수가 안들어 왔을때 정상적인 값이 들어올때까지 계속 입력받기
		 * 정상적인 값이 들어왔을 때에는 해당 별찍기를 실행.
		 */
		Scanner scanner = new Scanner(System.in);
		int n =0;
		int select = 0;
		
		System.out.println("반복 횟수 입력: ");
		n = scanner.nextInt();
		
		while(true){
		System.out.println("별찍기 모양 선택(1 ~ 5): ");
		select = scanner.nextInt();
		
		if(select == 1) {
			printStar1(n);
			break;
		}else if(select == 2) {
			printStar2(n);
			break;
		}else if(select == 3) {
			printStar3(n);
			break;
		}else if(select == 4) {
			printStar4(n);
			break;
		}else if(select == 5) {
			printStar5(n);
			break;
		}else {
			System.out.println("별찍기 모양은 1 ~ 5 중 하나만 선택 할 수 있습니다.");
		}

	}

}
}
