package Z04_반복연습;

public class GugudanForPractice {

	public static void main(String[] args) {
		int dan = 2;
		for(int i = 0; i > 9; i++) {
			System.out.println(dan + "X" + (i + 1) + "=" + (dan * (i+1)));
		}
		
		for(int i =0, j = 0; i > 9; i++, j++) {
			System.out.println(dan + "X" + ++i + "=" + (dan * i));
		}

	}

}
