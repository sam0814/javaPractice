package Z10_인터페이스연습2.view;

import java.util.Scanner;

public class InputImpl implements Input{

	@Override
	public char typedSelect(Scanner scanner) {
		System.out.println("명령을 입력하세요:");
		return scanner.next().charAt(0);
	}

}
