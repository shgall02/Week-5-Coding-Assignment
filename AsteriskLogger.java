
public class AsteriskLogger implements Logger{
	


	@Override
	public void Log(String log) {
		String asterisk = "***";
		System.out.println(asterisk + log + asterisk);
	}

	@Override
	public void Error(String error) {
		String asterisk = "***";
		System.out.println("****************");
		System.out.println(asterisk + "Error: " + error + asterisk);
		System.out.println("****************");
	}
	

	
}

