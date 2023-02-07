package s3patterns1n3;

public class Boat extends Vehicle {
	
	

	public Boat(String name) {
		super(name);
	}

	@Override
	public void Start() {
		System.out.println("Boat " +name+ " is starting");
	}

	@Override
	public void Accelerate() {
		System.out.println("Boat " +name+ " is accelerating");
	}

	@Override
	public void Stop() {
		System.out.println("Boat " +name+ " is stoping");
	}

}
