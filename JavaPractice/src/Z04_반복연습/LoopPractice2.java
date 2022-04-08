package Z04_반복연습;

public class LoopPractice2 {
	/*
	 * 1부터 100까지 더하기
	 * while
	 * for
	 */

	public static void main(String[] args) {
		
		int num =0;
		int result = 0;
		while(num < 100) {
			result += ++num;
		}
		System.out.println(result);
	
		System.out.println("========================");
	
	for(int j =0; j < 100; j++) {
		System.out.println(j);
	}

}
}
