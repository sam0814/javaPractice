package Z01_문자열;

public class StudentInfo {

	public static void main(String[] args) {
		String name = "송새미";
		char name1 = '송';
		
		System.out.println(name);
		/**
		 * 2022년 02월 22일 코리아아이티아카데미부산 학생정보
		 * year month day academy(문자열)
		 * 학생 이름 : 송새미
		 */
		
		int i_year = 2022;
		int i_month = 02;
		int i_day = 22;
		
		String year = "" + (++i_year);
		String month = "" + (++i_month);
		String day = "" + (++i_day);
		String academy = "코리아 아이티 아카데미 부산";
		String name2 = "송새미";
		
		System.out.println(Integer.parseInt(year) + 1);
		
		System.out.println("" + 'c' + 'a' + 'b');
		System.out.println(10 + "월");
		System.out.println(year + "년 " + month + "월 " + day + "일 " + academy + " 학생정보 " );
		System.out.println("학생이름 : " + name2);
		
		///////////////////////////////////
		/*
		 * 문자열 형변환
		 * 문자열(String) -> Integer(int)
		 * Integer.parseInt("100"); -> 숫자 100으로 변환
		 * Double.paraseDouble("15.123"); -> 실수 15.123으로 변환
		 * Boolean.paraseBoolean("true");
		 * 
		 * 정수, 실수 등을 문자열로 형변환
		 * Integer.toString(100); -> 문자열 100으로 변환
		 * Double.toString(3.41); -> 문자여 3.41로 변환
		 * Boolean.toString(true); -> 문자열 true로 변환
		 * 
		 */
		
		int num = Integer.parseInt("100");
		double dnum = Double.parseDouble("3.14");
		System.out.println(num + 20);
		System.out.println(dnum + 10);
		System.out.println(!Boolean.parseBoolean("true"));
		
		String num2= Integer.toString(200);
		System.out.println(num2 + 200);
	}
	
	

}
