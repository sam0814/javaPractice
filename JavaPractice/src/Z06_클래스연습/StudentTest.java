 package Z06_클래스연습;
/**
 * Student(클래스)
 * 속성
 * schoolName
 * studentYear
 * studentGroup
 * studentNumber
 * studentName
 * studentAdress
 * studentPhone
 * graduationFlag(boolean)
 * 
 * 기능(메소드)
 * showStudentInfo()
 * 학교명:부산고등학교
 * 학년: 3
 * 반: 2
 * 번호 : 10
 * 이름: 김준일
 * 주소: 부산 동래구
 * 연락처: 010-3382-7533
 * 졸업구분: true(졸업), false(재학중);
 * 
 * incrementYear()
 * 학년 + 1
 * 학년 3학년을 넘어서면 graduationFlag = true;
 */

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.schoolName = "화명고등학교";
		s1.studentYear = 2;
		s1.studentGroup = 7;
		s1.studentNumber = 14;
		s1.studentName = "송새미";
		s1.studentAdress = "부산 북구";
		s1.studentPhone = "010-3382-7533";
		s1.graduationFlag = false;
		
		s1.incrementYear();
		s1.showStudentInfo();
	}

}
