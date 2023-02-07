package s3patterns1n3;

public abstract class Vehicle {
	
	protected String name;
	
	public Vehicle(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void Start();
	
	public abstract void Accelerate();
	
	public abstract void Stop();

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
	
	
	
	

}
