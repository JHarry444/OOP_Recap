package main;

public class Chair {

	private int legs = 4;

	private String material = "Wood";

	private int seats = 1;

	public Chair() {
		super();
	}

	public Chair(int legs, String material, int seats) {
		super();
		this.legs = legs;
		this.material = material;
		this.seats = seats;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + legs;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chair other = (Chair) obj;
		if (legs != other.legs)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chair [legs=" + legs + ", material=" + material + ", seats=" + seats + "]";
	}

}
