package projects;

public class InvalidAccountNumberException extends Exception{
		
		private String msg="Invalid Account Number Exception";

		public InvalidAccountNumberException(){
			
		}
		
		public InvalidAccountNumberException(String msg){
			 this.msg=msg;
			
		}
		@Override
		public String toString() {
			return msg;
		}
	}

