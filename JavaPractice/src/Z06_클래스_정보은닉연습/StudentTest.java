package Z06_클래스_정보은닉연습;
/*
 * Student 클래스 정의
 * 속성
 * SchoolName
 * studentCode(학번) 20220000
 * studentYear
 * studentName
 * 
 * 생성자(기본, 전체)
 * getter, setter
 * 
 * 메소드 showStudentInfo
 * 학교명:코리아아이티아카데미
 * 학번:20220000
 * 학년: 1
 * 이름: 송새미
 * 
 * 학교명:코리아아이티아카데미
 * 학번:20220001
 * 학년: 1
 * 이름: 송새미2
 */

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setSchoolName("코리아아이티아카데미");
		s1.setStudentCode(20220000);
		s1.setStudentYear(1);
		s1.setStudentName("송새미");
		
		Student s2 = new Student();
		s2.setSchoolName("코리아아이티아카데미");
		s2.setStudentCode(20220001);
		s2.setStudentYear(1);
		s2.setStudentName("송새미2");
		
		//Student s1 = new Student("코리아아이티아카데미", 20220000, 1 , "송새미");
		//Student s2 = new Student("코리아아이티아카데미", 20220001, 1, "송새미2");
		
		s1.showStudentInfo();
		System.out.println();
		s2.showStudentInfo();
		

	}

}
