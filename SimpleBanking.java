package projects;
import java.util.Scanner;

public class SimpleBanking {
	double accountNumber;
	String accountHolderName;
	double balance;
	Scanner sc=new Scanner(System.in);
	public void CreateAccount(){
		System.out.println("**** Account Creation section ****");
		System.out.print("Enter your Name :");
		sc.nextLine();
		accountHolderName =sc.nextLine();
		System.out.print("Enter Your Mobile number :");
		accountNumber =sc.nextDouble();
		System.out.print("Deposit minumum Balance 1000rs :");
		balance =sc.nextDouble();
		System.out.println("------------------------------------------------------------");
		System.out.println("Your account created Sucessfully with credentials :");
		System.out.println("Name :"+accountHolderName);
		System.out.println("Account NUmber :"+accountNumber);
		System.out.println("Account Balance :"+balance);
		
	}
	public void DepositAmount(){
		System.out.println("*******Deposit Section********");
		System.out.print("Enter Account number :");
		double an=sc.nextDouble();
		if(an==accountNumber){
			System.out.print("enter Amount :");
			double amount=sc.nextDouble();
			if(amount<0){
				try{
					throw new NegativeAmountException();
				}catch(NegativeAmountException ne){
					System.out.println(ne);
				}
			}
			else{
				balance+=amount;
				System.out.println("Amount Depostied Sucessfully "+amount);
				System.out.println("Account Balance :"+balance);
			}
			}
		else{
			try{
				throw new InvalidAccountNumberException();
			}catch(InvalidAccountNumberException iane){
				System.out.println(iane);
			}
		}
		}
		public void WithDrawAmount(){
			System.out.println("*******WithDraw Section********");
			System.out.println("Enter Account number :");
			double an=sc.nextDouble();
			if(an==accountNumber){
				System.out.println("enter Amount :");
				double amount=sc.nextDouble();
				if(amount<0){
					try{
						throw new NegativeAmountException();
					}catch(NegativeAmountException ne){
						System.out.println(ne);
					}
				}else if(amount>balance){
					try{
						throw new InsufficientBalanceException();
					}catch(InsufficientBalanceException in){
						System.out.println(in);
					}
				
				}
				else{
					balance-=amount;
					System.out.println("Amount Withdrawed Sucessfully "+amount);
					System.out.println("Account Balance :"+balance);
					
				}
			
			}
			else{
				try{
					throw new InvalidAccountNumberException();
				}catch(InvalidAccountNumberException iane){
					System.out.println(iane);
				}
				
			
			}
			
		}public void Balanceenquiry(){
			System.out.println("*****Balance enquiry*****");
			System.out.println("Available Balance :"+balance);
			
		}


	public static void main(String[] args) {
		SimpleBanking sb=new SimpleBanking();
		
		
		while(true){
			System.out.println("------------------------------------------------------------");
			System.out.println("****Select a Option******");
			System.out.println("1.Create Account");
			System.out.println("2.Deposit Amount");
			System.out.println("3.WithDraw Amount");
			System.out.println("4.Balance enquiry");
			System.out.println("5.Exit");
			int option=sb.sc.nextInt();
		if(option==1){
			sb.CreateAccount();
			
		}
		else if(option==2){
			sb.DepositAmount();
			
		}
		else if(option==3){
			sb.WithDrawAmount();
			
		}else if(option==4){
			sb.Balanceenquiry();
			
		}
		else if(option==5){
			break;
		}	
		else{
			System.out.println("Enter valid input");
		}
		
		
		

	}
	}

}
