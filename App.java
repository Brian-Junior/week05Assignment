package week05;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.Log("System");
		
		logger.Error("Crash");
		
		Logger logger2 = new SpacedLogger();
		
		logger2.Log("Help");
		logger2.Error("Broken");
	}
	
	
}
