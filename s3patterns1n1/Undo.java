package s3patterns1n1;

import java.util.LinkedList;

public class Undo {

	private static LinkedList<String> history;
	private static Undo instance;

	private Undo() {
//		empty
	}

//	Singleton pattern
	public static Undo getInstance() {
		if (instance == null) {
			instance = new Undo();
		}
		return instance;
	}

	public static void addCommand(String cmd) {
		
		if (history==null) {
			history = new LinkedList<String>();
			history.add(cmd);
		} else {
			history.addLast(cmd);
			if (history.size() > 6) {
				history.removeFirst();
			}
		}
	}

	public static void undoCommand() {
		if(history==null) {
			System.out.println("there's no previous command");
		}else if(history.size()==1){
			history.removeLast();
		}else {
			history.removeLast();
			history.removeLast();	
		}
			
	}

	public static LinkedList<String> getHistory() {
		if(history!=null) {
			history.removeLast();
		}else {
			System.out.println("there's no history");
		}
		return history;
	}

}
