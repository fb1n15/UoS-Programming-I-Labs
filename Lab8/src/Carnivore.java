public class Carnivore extends Animal {
	
	public Carnivore(String carName, Integer carAge){
	super(carName, carAge);
	}
	
	public Carnivore(){
		super();
	}
	/**
	 * Checks whether the carnivore can eat this type of food
	 */
	@Override
	public void eat(Food foodConsumed) throws Exception {
		
			if (foodConsumed instanceof Plant){
					throw new Exception("A carnivore cannot eat plants.");
			}else{
					System.out.println(this.getName()+" is eating "+ foodConsumed.getName());
			}
		
	}

	@Override
	public void makeNoise() {
	}
}
