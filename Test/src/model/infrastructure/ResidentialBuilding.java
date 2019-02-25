package model.infrastructure;

import java.util.ArrayList;

import model.disaster.Disaster;
import simulation.Address;
import simulation.Rescuable;
import simulation.Simulatable;

public class ResidentialBuilding implements Simulatable,Rescuable {
	private Address location;
	private int structuralIntegrity=100;
	private int fireDamage=0;
	private int gasLevel=0;
	private int foundationDamage=0;
	ArrayList<Citizen> occupants;
	private Disaster disaster;
	

	public ResidentialBuilding(Address location) {
		// TODO Auto-generated constructor stub
		this.location=location;
	}


	public int getStructuralIntegrity() {
		return structuralIntegrity;
	}


	public void setStructuralIntegrity(int structuralIntegrity) {
		this.structuralIntegrity = structuralIntegrity;
	}


	public int getFireDamage() {
		return fireDamage;
	}


	public void setFireDamage(int fireDamage) {
		this.fireDamage = fireDamage;
	}


	public int getGasLevel() {
		return gasLevel;
	}


	public void setGasLevel(int gasLevel) {
		this.gasLevel = gasLevel;
	}


	public int getFoundationDamage() {
		return foundationDamage;
	}


	public void setFoundationDamage(int foundationDamage) {
		this.foundationDamage = foundationDamage;
	}


	public Address getLocation() {
		return location;
	}


	public ArrayList<Citizen> getOccupants() {
		return occupants;
	}


	public Disaster getDisaster() {
		return disaster;
	}

}
