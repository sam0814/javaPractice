package Z05_함수연습;

public class MethodEx1_Practice {
	public static void showName2(String name) {
		if(name == null) {
			return;
		}
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		showName2(null);
	}

}
