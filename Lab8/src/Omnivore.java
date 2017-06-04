
public class Omnivore extends Animal{
	
	public Omnivore (String omniName,Integer omniAge){
		super(omniName, omniAge);
	}
	
	@Override
	public void eat(Food foodConsumed) {
		System.out.println(this.getName()+" is eating "+ foodConsumed.getName());
		
	}

	@Override
	public void makeNoise() {
	}

}
