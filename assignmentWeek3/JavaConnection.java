package assignmentWeek3;

public class JavaConnection implements DatabaseConnection {

	//Adding unimplemented methods
	
	public void connect() {
		System.out.println("Connect to the database");
		
	}

	public void disconnect() {
		System.out.println("Disconnect from the database");
		
	}

	public void executeUpdate() {
		System.out.println("Update the connection status");
		
	}
	public static void main(String[] args) {
		//Create object for java connection class
		DatabaseConnection db = new JavaConnection();
		//Calling abstract methods from DatabaseConnection interface
		db.connect();
		db.disconnect();
		db.executeUpdate();
		
	}

}
