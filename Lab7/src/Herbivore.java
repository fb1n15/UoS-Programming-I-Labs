
public abstract class Herbivore extends Animal{
	
	public Herbivore(String herbName,Integer herbAge){
		super(herbName, herbAge);
	}
	
	@Override
	/**
	 * Throws an error if a herbivore attempts to eat meat.
	 */
	public void eat(Food foodConsumed) throws Exception {
		if (foodConsumed instanceof Meat){
			throw new Exception("A herbivore cannot eat meat.");
		}else{
			System.out.println(this.getName()+" is eating "+ foodConsumed.getName());
		}
	}
}
