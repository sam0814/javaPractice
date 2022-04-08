package Z04_반복연습;

public class GugudanPractice2 {

	public static void main(String[] args) {
		/*
		int dan =0;
		for(; dan < 9; dan++) {
			for(int j = 0; j < 9; j++) {
				System.out.println((dan + 2) + "X" + (j + 1) + " = " + ((dan + 1) * (j + 1)));
			
			}
			System.out.println();
		}
		*/
		
		for(int i =0; i < 8; i++) {
			int dan = i +2;
			System.out.println(dan + "단");
			for(int j = 0; j < 9;) {
				System.out.println(dan + "X" + (++j) + "=" + (dan * j));
			}
			System.out.println();
		}
		

}
}
