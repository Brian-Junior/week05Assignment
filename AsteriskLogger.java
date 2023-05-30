package week05;

public class AsteriskLogger  implements Logger{

	@Override
	public void Log(String Log) {
		System.out.println("***" + Log + "***");
		
	}

	@Override
	public void Error(String Error) {
		System.err.println("Error:" + Error);
		
	}

}
