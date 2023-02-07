package s3patterns1n3;

public class Stop implements Command {
	
	private Vehicle vehicle;
	
	public Stop(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		vehicle.Stop();
	}

}
