package projects;

public class InsufficientBalanceException extends Exception{
	
	private String msg="Insufficient Balance Exception";
	
	
	public InsufficientBalanceException(){
		
	}
	
	public InsufficientBalanceException(String msg){
			this.msg=msg;
		
	}
	
	@Override
	public String toString() {
		return msg;
	}
}
