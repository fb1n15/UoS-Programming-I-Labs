
public abstract class Animal implements Comparable<Animal> {

	Integer age;
	String name;

	public Animal(String aniName, Integer aniAge) {
		name = aniName;
		age = aniAge;
	}

	public Animal() {
		this("newborn",0);
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
	/**
	 * Prints a noise
	 */
	public abstract void makeNoise();
	/**
	 * Consumes a food object.
	 * @param foodConsumed - A food object to eat
	 * @throws Exception - If the animal type cannot eat this food
	 */
	public abstract void eat(Food foodConsumed) throws Exception;

	public void eat(Food foodConsumed, Integer timesToFeed) throws Exception {
		for (int i = 0; i < timesToFeed; i++) {
			this.eat(foodConsumed);
		}
	}

	/**
	 * Returns 0 if equal, a positive number if the current animal's age is
	 * greater and negative if the other animal is older.
	 * ORDERS FROM LOW TO HIGH. For high to low just return the opposite value.
	 * -(return this.getAge() - secAnimal.getAge());
	 */
	public int compareTo(Animal secAnimal) {
		return this.getAge() - secAnimal.getAge();
	}

}
