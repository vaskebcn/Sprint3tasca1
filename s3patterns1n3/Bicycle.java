package s3patterns1n3;

public class Bicycle extends Vehicle {

	public Bicycle(String name) {
		super(name);
	}

	@Override
	public void Start() {
		System.out.println("Bicycle " +name+ " is starting");
	}

	@Override
	public void Accelerate() {
		System.out.println("Bicycle " +name+ " is accelerating");
	}

	@Override
	public void Stop() {
		System.out.println("Bicycle " +name+ " is stoping");
	}

}
