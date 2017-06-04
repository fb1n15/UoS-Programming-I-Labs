
public class Main {

	public static void main(String[] Args) {
		
		//Create animal objects
		Wolf engWolf = new Wolf("Mike", 5);
		Parrot engParrot = new Parrot("John", 8);
		Meat oldMeat = new Meat("Pork");
		Plant newPlant = new Plant("Margarita");
		Turtle engTurtle = new Turtle("George", 2);

		System.out.println("Wolf's name is " + engWolf.getName() + " and he is " + engWolf.getAge() + " years old.");
		System.out.println(
				"Parrot's name is " + engParrot.getName() + " and he is " + engParrot.getAge() + " years old.");
		engParrot.makeNoise();
		
		// uses the eat() method of each animal
		feedAnimal(engWolf, newPlant);
		feedAnimal(engTurtle, oldMeat);
		
		try {
			engWolf.eat(oldMeat, 6);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}
	/**
	 * Checks whether the animal will throw an exception or no
	 * @param animal The animal that is eating the food
	 * @param food
	 */
	public static void feedAnimal(Animal animal, Food food) {
		try {
			animal.eat(food);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
