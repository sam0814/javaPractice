package Z07_배열연습;

public class ArrayTest {

	public static void main(String[] args) {
		/*
		int[] numbers = new int[10];
		
		numbers[1] = 100;
		
		for(int i =0; i < 10; i++) {
			System.out.println(numbers[i]);
		}
		*/
		
		/*
		 * String 배열 10개의 공간을 생성
		 * 가나다라마바사아자차 출력
		 */
		
		String[] kor = new String[15];
		
		kor[0] = "가";
		kor[1] = "나";
		kor[2] = "다";
		kor[3] = "라";
		kor[4] = "마";
		kor[5] = "바";
		kor[6] = "사";
		kor[7] = "아";
		kor[8] = "자";
		kor[9] = "차";
		
		for(int i =0; i < kor.length; i++) {
			System.out.println(kor[i]);
		}
		
		int[] numArray = new int[100];
		for(int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		

	}

}
