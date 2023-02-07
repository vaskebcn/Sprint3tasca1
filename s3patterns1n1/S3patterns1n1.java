package s3patterns1n1;

import java.util.Scanner;

public class S3patterns1n1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String instruction;

//		Undo.getInstance();
		
		instruction = menu();

		work(instruction);

	}

	public static String menu() {
		String command = "1";
		String undo = "2";
		String hist = "3";
		String exit = "0";

		String instruction;

		System.out.println("For enter a command press 1" + "\n" + 
						   "For undo the command press 2" + "\n"+ 
						   "For show history press 3" + "\n" + 
						   "For return/exit press 0");

		instruction = sc.nextLine();

		if (!instruction.equals(command) 
				&& !instruction.equals(undo) 
				&& !instruction.equals(hist)
				&& !instruction.equals(exit)) {
			System.out.println("query not permited");
			return menu();
		} else {
			System.out.println("instruction correct");
			return instruction;
		}
		

	}

	public static void work(String instruction) {

		String command = "1";
		String undo = "2";
		String hist = "3";
		String exit = "0";
		@SuppressWarnings("unused")
		String back;

		if (instruction.equals(command)) {
			back = queryCommand(command);
		} else if (instruction.equals(undo)) {
			queryUndo();
		} else if (instruction.equals(hist)) {
			queryHist();
		} else if (instruction.equals(exit)) {
			queryExit();
		}
	}

	public static String queryCommand(String command) {

		String undo = "2";
		String hist = "3";
		String exit = "0";
		while ((!command.equals(hist)) && (!command.equals(undo) && !command.equals(exit))) {

			System.out.println("add command");
			command = sc.nextLine();
			Undo.addCommand(command);
			work(command);
		}

		return command;
	}

	public static void queryUndo() {
		String command = "1";
		Undo.undoCommand();
		work(command);
	}

	public static void queryHist() {
		String command = "1";
		System.out.println(Undo.getHistory());
		work(command);
	}

	public static void queryExit() {
		System.out.println("thats all folks");
	}

}
