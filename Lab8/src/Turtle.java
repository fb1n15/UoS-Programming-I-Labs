
public class Turtle extends Herbivore{
	public Turtle(String turName, Integer turAge){
		super(turName,turAge);
	}

	@Override
	public void makeNoise() {
		System.out.println("I am a turtle!");
	}
}
