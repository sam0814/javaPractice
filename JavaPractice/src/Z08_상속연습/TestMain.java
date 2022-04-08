package Z08_상속연습;

public class TestMain {

	public static void main(String[] args) {
		Test test = new Test();
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		
		// 자식 -> 부모 : 업캐스팅
		Test t1 = test1;
		Test t2 = test2;
		
		// 부모 -> 자식 :  다운캐스팅
		Test1 tt1 = (Test1)t1;
		Test tt2 = (Test2)t2;

	}

}
