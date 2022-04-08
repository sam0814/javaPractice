package Z10_인터페이스연습2;

import Z10_인터페이스연습2.controller.PageController;
import Z10_인터페이스연습2.view.IndexImpl;
import Z10_인터페이스연습2.view.InputImpl;

public class Main {

	public static void main(String[] args) {
		PageController pageController = new PageController(new IndexImpl(), new InputImpl());
		pageController.index();
		

	}

}
