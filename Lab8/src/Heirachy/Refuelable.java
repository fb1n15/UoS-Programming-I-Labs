package Heirachy;
/*
 * Refuable is an interface as it more like a property rather than heirachy.
 */
public interface Refuelable{
	
	Integer fuelUsed= new Integer(0);
	Integer fuelCost=new Integer(1);
	
	public abstract void setFuelCost();
	public abstract void setFuelUsed();
	
	
}


