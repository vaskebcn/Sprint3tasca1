package s3patterns1n3;

public class Plane extends Vehicle {

	public Plane(String name) {
		super(name);
	}

	@Override
	public void Start() {
		System.out.println("Plane " +name+ " is starting");
	}

	@Override
	public void Accelerate() {
		System.out.println("Plane " +name+ " is accelerating");
	}

	@Override
	public void Stop() {
		System.out.println("Plane " +name+ " is stoping");
	}

}
