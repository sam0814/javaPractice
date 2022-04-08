package Z06_클래스연습;

public class Student {
	
	String schoolName;
	int studentYear;
	int studentGroup;
	int studentNumber;
	String studentName;
	String studentAdress;
	String studentPhone;
	boolean graduationFlag;
	
	
	
	public Student() {}
	
	
	
	public Student(String schoolName, int studentYear, int studentGroup, int studentNumber, String studentName,
			String studentAdress, String studentPhone, boolean graduationFlag) {
		super();
		this.schoolName = schoolName;
		this.studentYear = studentYear;
		this.studentGroup = studentGroup;
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentAdress = studentAdress;
		this.studentPhone = studentPhone;
		this.graduationFlag = graduationFlag;
	}



	public void showStudentInfo() {
		System.out.println("학교명: " + schoolName);
		System.out.println("학년: " + studentYear);
		System.out.println("반: " + studentGroup);
		System.out.println("번호: " + studentNumber);
		System.out.println("이름: " + studentName);
		System.out.println("주소: " + studentAdress );
		System.out.println("연락처: " + studentPhone);
		System.out.println("졸업구분: " + (graduationFlag == true ? "졸업" : "재학중"));
	}
	
	public void incrementYear() {
		if(studentYear > 2 && graduationFlag == false) {
			graduationFlag = true;
		}else {
			studentYear++;
		}
	}

}
