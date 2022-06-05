
	
	public class SpacedLogger implements Logger {	
		
		
				
		@Override
		public void Log(String log) {
			for(int i = 0; i < log.length(); i++) {
				System.out.print(log.charAt(i) + " ");
			}
		}
		

		@Override
		public void Error(String error) {
			System.out.println(" ");
			System.out.print("ERROR: ");
			for(int i = 0; i < error.length(); i++) {
				System.out.print(error.charAt(i) + " ");
			}
		}
		}
	

