package Z08_상속연습;

public class AnlmalTest {

	public static void main(String[] args) {
		Human human = new Human();
		Eagle eagle = new Eagle();
		Tiger tiger = new Tiger();
		
		human.move();
		eagle.move();
		tiger.move();
		
		Animal[] animals = new Animal[3];
		animals[0] = human;
		animals[1] = eagle;
		animals[2] = tiger;
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].move();
		}

	}

}
