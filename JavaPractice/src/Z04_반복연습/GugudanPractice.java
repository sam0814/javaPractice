package Z04_반복연습;

public class GugudanPractice {

	public static void main(String[] args) {
		for(int i =0; i < 8; i++) {
			int dan = i + 2;
			System.out.println(dan + "단");
			
		for(int j =0; j < 9; ) {
				System.out.println(dan + "X" + (++j) + "=" + (dan * j));
			}
			System.out.println();
		}
	}
}


