
public class Parrot extends Omnivore{
	
	public Parrot(String parName, Integer parAge){
		super(parName,parAge);
	}
	public Parrot(Integer parAge){
		this("Polly",parAge);
	}
	
	/*public void rawr(){
		System.out.println("I am a parrot!");
	}*/

	@Override
	public void makeNoise() {
		System.out.println("I am a parrot!");
	}
	@Override
	public int compareTo(Animal arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
