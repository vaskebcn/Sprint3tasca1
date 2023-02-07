package s3patterns1n3;

public class Car extends Vehicle {
	
//	private String name;

	public Car(String name) {
		super(name);
	}

	@Override
	public void Start() {
		System.out.println("Car " +name+ " is starting");
	}

	@Override
	public void Accelerate() {
		System.out.println("Car " +name+ " is accelerating");
	}

	@Override
	public void Stop() {
		System.out.println("Car " +name+ " is stoping");
	}

}
