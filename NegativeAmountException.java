package projects;

public class NegativeAmountException extends Exception{
	

	private String msg="Negative Amount Exception";
	
	
	public NegativeAmountException(){
		
	}
	
	public NegativeAmountException(String msg){
			this.msg=msg;
		
	}
	@Override
	public String toString() {
		return msg;
	}
}

