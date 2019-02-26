package model.disasters;

import simulation.Rescuable;
import simulation.Simulatable;

abstract public class Disaster implements Simulatable {
	private int startCycle;
	private Rescuable target;
	boolean active=false;
	
	

	public Disaster(int startCycle, Rescuable target) {
		// TODO Auto-generated constructor stub
		this.startCycle=startCycle;
		this.target=target;
	}



	public int getStartCycle() {
		return startCycle;
	}



	public void setStartCycle(int startCycle) {
		this.startCycle = startCycle;
	}



	public Rescuable getTarget() {
		return target;
	}



	public void setTarget(Rescuable target) {
		this.target = target;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}

}
