
public class Herbivore extends Animal{
	
	public Herbivore(String herbName,Integer herbAge){
		super(herbName, herbAge);
	}
	
	@Override
	/**
	 * Checks whether the carnivore can eat this type of food
	 */
	public void eat(Food foodConsumed) throws Exception {
		if (foodConsumed instanceof Meat){
			throw new Exception("A herbivore cannot eat meat.");
		}else{
			System.out.println(this.getName()+" is eating "+ foodConsumed.getName());
		}
	}

	@Override
	public void makeNoise() {
	}
}
