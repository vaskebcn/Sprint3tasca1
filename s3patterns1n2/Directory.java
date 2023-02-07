package s3patterns1n2;

import java.util.ArrayList;

public class Directory {

	private static ArrayList<Contact> directory;
	private static Directory directoryInstance;

	private Directory() {
//			empty
	}

	// Singleton pattern
	public static Directory getDirectory() {
		if (directoryInstance == null) {
			directoryInstance = new Directory();
		}
		return directoryInstance;
	}

	public static void addContact(Contact contact) {
		if (directory == null) {
			directory = new ArrayList<Contact>();
		}
		directory.add(contact);
	}
	
	public static ArrayList<Contact> showDirectory(){
		if (directory ==null) {
			System.out.println("empty directory");
			return null;
		}else {
		return directory;
		}
	}

	@Override
	public String toString() {
		return "Directory []";
	}
	

	
	

}
