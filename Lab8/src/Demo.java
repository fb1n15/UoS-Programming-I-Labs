import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {

	public static void main(String[] Args) {
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		animalList.add(new Parrot(4));
		animalList.add(new Wolf("Harry", 8));
		animalList.add(new Turtle("Mike", 5));
		animalList.add(new Wolf("John", 9));
		animalList.add(new Turtle("Kostas", 1));
		animalList.add(new Wolf("Nick", 4));
		animalList.add(new Wolf("Nick", 5));

		/*
		 * An Interface is a group of related methods with empty bodies and by
		 * implement one you make your class more formal. With an interface all
		 * fields that you create are public, final, static and the methods
		 * public.On the other hand, in an abstract class you have freedom to
		 * choose (public, private, not static etc). Also, you implement
		 * infinite number of interfaces but only extend one class.
		 */

		printNameAge(animalList);

		Collections.sort(animalList);
		printNameAge(animalList);
		
		Collections.sort(animalList, Comparators.NAME);
		printNameAge(animalList);
		
		Collections.sort(animalList,Comparators.AGE);
		printNameAge(animalList);
		
		Collections.sort(animalList,Comparators.NAMEANDAGE);
		printNameAge(animalList);
	}
	/**
	 * Prints the name and age of the animal list
	 * @param list - Given animal list
	 */
	public static void printNameAge(ArrayList<Animal> list) {
		for (Animal currentAnimal : list) {
			System.out.println(currentAnimal.getName() + " " + currentAnimal.getAge());

		}
		System.out.println("*************");
	}
	/**
	 * Creates comparators for the class Animal
	 */
	public static class Comparators {
	    public static final Comparator<Animal> NAME = (Animal s1, Animal s2) -> s1.name.compareTo(s2.name);
	    public static final Comparator<Animal> AGE = (Animal s1, Animal s2) -> Integer.compare(s1.age, s2.age);
	    public static final Comparator<Animal> NAMEANDAGE = (Animal s1, Animal s2) -> NAME.thenComparing(AGE).compare(s1, s2);
	}
}
