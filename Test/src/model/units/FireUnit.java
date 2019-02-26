package model.units;

public abstract class FireUnit extends Unit{
	FireUnit(String id, Address location, int stepsPerCycle){
		super(id, location, stepsPerCycle);
	}
}
