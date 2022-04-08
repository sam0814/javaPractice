package Z04_반복연습;

public class GugudanWhilePractice2 {
	/*
	 * 2 X 1 =2
	 * 2 X 2 =4
	 * 2 X 3=6
	 * ...
	 * 2 x 9 =18
	 */

	public static void main(String[] args) {
		int dan =2;
		int num =0;
		while(num < 9) {
			System.out.println(dan + "X" + (num + 1) + "=" + (dan * (num + 1)));
			num++;
		}
		System.out.println("------------------");
		
		for(num = 0; num < 9; num++) {
			System.out.println(dan + "X" + (num + 1) + "=" + (dan * (num + 1)));
		}
		for(num = 0; num < 9;) {
			System.out.println(dan + "X" + ++num + "=" + (dan * num));
		}
	}

}
