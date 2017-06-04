
public class Main {
	/**
	 * At the end of the instructions the program still had an error 
	 * because Carnivore, Herbivore and Omnivore classes didn't
	 *  implement the makeNoise() abstract method from their parent.
	 *  Since these classes never instantiate I declared them abstract 
	 *  in order to avoid the error.
	 */
	public static void main(String[] Args){
		
		Wolf engWolf = new Wolf("Mike",5);
		Parrot engParrot = new Parrot("John",8);
		Meat oldMeat = new Meat("Pork");
		Plant newPlant = new Plant("Margarita");
		Turtle engTurtle = new Turtle("George",2);
		
		System.out.println("Wolf's name is " + engWolf.getName() + " and he is "+ engWolf.getAge()+" years old.");
		System.out.println("Parrot's name is " + engParrot.getName() + " and he is "+ engParrot.getAge()+" years old.");
		engParrot.makeNoise();
		/**
		 * Having the two commands in the same try/catch block means
		 *  if the first one is thrown then the second is never executed.
		 *  In order to avoid this you can either just create two try/catch blocks
		 *  or one method that would execute the eat() method.
		 */
		/*
		 * Execution based on the instructions.
		try{
			engWolf.eat(newPlant);
			engTurtle.eat(oldMeat);
		}catch(Exception e){
			System.out.println(e.getMessage());
	
		} */
		feedAnimal(engWolf,newPlant);
		feedAnimal(engTurtle,oldMeat);

	}
	/**
	 * Feeds an Animal Object with given food
	 * @param animal - Animal object
	 * @param food - food Object to be eaten
	 */
	public static void feedAnimal(Animal animal, Food food){
		try{
			animal.eat(food);
		}catch(Exception e){
			System.out.println(e.getMessage());
	
		}
	}
}
