package simulation;

import java.util.ArrayList;

import model.disasters.Disaster;
import model.infrastructure.ResidentialBuilding;

public class Simulator {
	private int currentCycle;
	private ArrayList<ResidentialBuilding> buildings;
	private ArrayList<Citizen> citizens;
	private ArrayList<Unit> emergencyUnits;
	private ArrayList<Disaster> plannedDisasters;
	private ArrayList<Disaster> executedDisaster;
	private Address[][] world;
	

	public Simulator() {
		// TODO Auto-generated constructor stub
		world=new Address[10][10];
		for (int i=0;i<world.length;i++)
		{
			for(int j=0;j<world[i].length;j++)
				world[i][j]=new Address(i,j);
		}
	}

}
