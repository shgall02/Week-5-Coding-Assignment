
public class App {
	public static void main(String[] args) {
		
		
		AsteriskLogger log = new AsteriskLogger();
		log.Log("Hello");
		
		AsteriskLogger error = new AsteriskLogger();
		error.Error("Hello");
		
		SpacedLogger spaceLog = new SpacedLogger();
		spaceLog.Log("Hello");
		
		SpacedLogger spaceError = new SpacedLogger();
		spaceError.Error("Hello");
	}
}
