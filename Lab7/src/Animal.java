
public abstract class Animal {
	
	Integer age;
	String name;
	
	public Animal(String aniName, Integer aniAge){
		name = aniName;
		age = aniAge;
	}
	
	public String getName(){
		return name;
	}
	
	public Integer getAge(){
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
}
