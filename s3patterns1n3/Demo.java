package s3patterns1n3;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Vehicle>parking = new ArrayList<Vehicle>();
		
		Vehicle car1 = new Car("alfa");
		Vehicle boat1 = new Boat("mercury");
		Vehicle plane1 = new Plane("cessna");
		Vehicle bicycle1 = new Bicycle("cannondale");
		
		parking.add(car1);
		parking.add(boat1);
		parking.add(plane1);
		parking.add(bicycle1);
		
		Invoker driver = new Invoker();
		
		for (Vehicle vehicle : parking) {
			driver.addCommand(new Start(vehicle));
			driver.addCommand(new Accelerate(vehicle));
			driver.addCommand(new Stop(vehicle));
		}
		
		driver.doCommand();
		
	}

}
