package edu.ncsu.monopoly;

public abstract class Cell implements IOwnable {
	private String name;
	protected Player propietary;
	private boolean available = true;

	public String getName() {
		return name;
	}

	@Override
	public Player getPropietary() {
		return propietary;
	}
	
	public int getPrice() {
		return 0;
	}

	public abstract void playAction();

	void setName(String name) {
		this.name = name;
	}

	@Override
	public void setPropietary(Player owner) {
		this.propietary = owner;
	}
    
    public String toString() {
        return name;
    }

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
