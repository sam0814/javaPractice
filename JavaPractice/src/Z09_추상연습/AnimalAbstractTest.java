package Z09_추상연습;

public class AnimalAbstractTest {

	public static void main(String[] args) {
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal animal = new Eagle();
		
		human.move();
		tiger.move();

	}

}
