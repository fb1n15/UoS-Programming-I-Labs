package Heirachy;
/*
 * Hierachy:
 * Transport --> JetPlan implements Refuelable
 * 				 Train
 * 				 RoadVehicle --> Bicycle
 * 								 Car implements Refuelable
 * 								 Cycle implements Refuelable
 * 								 Tricycle
 */
public abstract class Transport {
	
	String name;
	
	
	public Transport(String vehicleName) {
		name = vehicleName;
	}

}
