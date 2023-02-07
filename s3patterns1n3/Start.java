package s3patterns1n3;

public class Start implements Command {
	
	private Vehicle vehicle;
	
	public Start(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		vehicle.Start();

	}

}
