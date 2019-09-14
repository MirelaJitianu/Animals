import java.util.ArrayList;

public class AnimalsMain {

	public static void main(String[] args) {

		ArrayList<Animal> animalList = new ArrayList<Animal>();

		Bird tweety = new Bird("Tweety", "tweet");
		animalList.add(tweety);

		Dog oscar = new Dog("Oscar", "ham-ham");
		animalList.add(oscar);

		Cat tom = new Cat("Tom", "miau");
		animalList.add(tom);

		Monkey tarzan = new Monkey("Tarzan", "uga buga");
		animalList.add(tarzan);

		animalList.forEach((element) -> {
			element.show();

//			if (element.getClass().isInstance(oscar)) {
//				oscar.digHole();
//			}
		});
	}
}
