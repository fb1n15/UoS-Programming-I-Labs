
public class Parrot extends Omnivore{
	
	public Parrot(String parName, Integer parAge){
		super(parName,parAge);
	}
	
	@Override
	/*
	 * @see Animal#makeNoise()
	 */
	public void makeNoise() {
		System.out.println("I am a parrot!");
	}
}
