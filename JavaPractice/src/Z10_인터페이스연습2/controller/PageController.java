package Z10_인터페이스연습2.controller;

import java.util.Scanner;

import Z10_인터페이스연습2.view.Index;
import Z10_인터페이스연습2.view.Input;

public class PageController {
	private final Index index;
	private final Input input;
	
	public PageController(Index index) {
		this.index = index;
		this.input = input;
	}
	
	public void index() {
		index.show();
		input.typedSelect(new Scanner(System.in));
		
		
		
	}

}
