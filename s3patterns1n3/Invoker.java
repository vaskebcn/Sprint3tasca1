package s3patterns1n3;

import java.util.ArrayList;

public class Invoker {
	
	private ArrayList<Command>commandList = new ArrayList<Command>();
	
	
	public void addCommand(Command command) {
		commandList.add(command);
	}
	
	public void doCommand() {
		for (Command command : commandList) {
			command.execute();
		}
		commandList.clear();
	}

}
