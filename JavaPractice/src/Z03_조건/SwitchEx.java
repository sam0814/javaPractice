package Z03_조건;

public class SwitchEx {

	public static void main(String[] args) {
		
		int select = 2;
		
		switch(select) {
		case 1 :
			System.out.println("1을 선택 하셨습니다.");
			break;
		case 2 :
			System.out.println("2를 선택 하셨습니다.");
			break;
		case 3 :
			System.out.println("3을 선택 하셨습니다.");
			break;
			
			default :
				System.out.println("해당 case는 없습니다.");
		}
		
		String select2 = "김준일";
		
		switch(select2) {
		case "김준일" :
			System.out.println("선택하신 이름은 김준일 입니다.");
			break;
		case "김준이" :
			System.out.println("선택하신 이름은 김준이 입니다.");
			break;
		case "김준삼" :
			System.out.println("선택하신 이름은 김준삼 입니다.");
			break;
		}
		
		int num = 50;
		if(num ==0) {
			System.out.println("0입니다.");
		}else {
		
		
		
		switch(num == 0 ? 2 : num % 2 ) {
			
		case 0 : 
			System.out.println("짝수입니다.");
			break;
		case 1 :
			System.out.println("홀수입니다.");
			break;
		default :
			System.out.println("0입니다.");
			
			
		}

	}

}
	}
