
public abstract class Carnivore extends Animal {

	public Carnivore(String carName, Integer carAge) {
		super(carName, carAge);
	}
	
	@Override
	/**
	 * Throws an error if a carnivore attempts to eat a plant.
	 */
	public void eat(Food foodConsumed) throws Exception {

		if (foodConsumed instanceof Plant) {
			throw new Exception("A carnivore cannot eat plants.");
		} else {
			System.out.println(this.getName() + " is eating " + foodConsumed.getName());
		}

	}

}
