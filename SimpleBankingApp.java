package BankingApplication;
import java.util.*;

//------------------------------------------------------------------------------------------------------------

class BankAccount
{
	int Balance;
	int Previous_Transection;
	String Customer_Name;
	int Customer_Id;
	int Account_No;
	 
	BankAccount()
	{
		System.out.println("     WELCOME TO ONLINE BANKING APPLICATION     ");
	}
	
	
	
//----------------------------------------------------------------------------------------------------------	
	void Deposit(int amount)
	
	{
		if(amount>0)
		{
			Balance = Balance + amount;
			Previous_Transection = amount;
			
		}
		}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	void Withdraw(int amount)
	{
		if(amount>0)
		{
			Balance =Balance - amount;
			Previous_Transection=Previous_Transection - amount;
			
		}
	}
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	void get_Previous_Transection()
	{
		if(Previous_Transection > 0)
		{
			System.out.println("Deposited "   +Previous_Transection);
		}
		else if(Previous_Transection < 0)
		{
			System.out.println("WithDrawn  "   +Math.abs(Previous_Transection));
		}
		else
		{
			System.out.println("No Transection Occured");
		}
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	void Calculate_Interest()
	{
		int Principal,Rate,Time;
		double RateOfInterest;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Principal Amount : ");
		Principal=sc.nextInt();
		System.out.println("Enter Rate : ");
		Rate=sc.nextInt();
		System.out.println("Enter Time : ");
		Time=sc.nextInt();
		RateOfInterest=(Principal*Rate*Time)/100;
		System.out.println(" RATE OF INTEREST IS  " +RateOfInterest);
		
	}
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	void show()
	{
		int choice=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("   CHOOSE ANY ONE   ");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(" \n ");
		System.out.println("1.  NEW USER");
		System.out.println("2.  EXISTING USER");
		System.out.println("3.  EXIT");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		do
		{
			System.out.println("******************************************************************************");
			System.out.println("ENTER ANY OPTION ");
			System.out.println("******************************************************************************");
			choice = sc.nextInt();
			System.out.println(" \n ");
			switch(choice)
			{
			case 1:
				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
				NewUser();
				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			case 2:
				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
				 ExistingUser();
				 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			case 3:
				System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££");
			break;
			default:
		    	System.out.println("SORRY!!!! ");
		    	System.out.println("INVALID OPTION!!!!! ");
		    	System.out.println("PLEASE ENTER AGAIN... ");
		    	break;
			}
		}
			while(choice!= 3);
		System.out.println(" THANK YOU FOR VISITING....");
		Show_Menu();
				
	}
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	void NewUser()
	{
		Scanner sc = new Scanner(System.in);
		
		long Mobile_No;
		String Address;
		String Branch_Name;
		System.out.println(" ENTER YOUR NAME :");
		Customer_Name=sc.next();
		System.out.println(" ENTER YOUR ACCOUNT NO :");
		Account_No=sc.nextInt();
		System.out.println(" ENTER YOUR ID :");
		Customer_Id=sc.nextInt();
		System.out.println(" ENTER YOUR MOBILE NUMBER :");
		Mobile_No=sc.nextLong();
		System.out.println(" ENTER YOUR ADDRESS :");
		Address=sc.next();
		System.out.println(" ENTER YOUR BRANCH NAME :");
		Branch_Name=sc.next();
		System.out.println(" RESISTRATION SUCCESSFULLY ");
		System.out.println("ENTER AN AMOUNT TO DEPOSIT : ");
		System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££");
		int amount=sc.nextInt();
		Deposit(amount);
		System.out.println("SUCCESSFULLY DEPOSITED..");
		System.out.println(" \n ");
		Show_Menu();
		
		
		
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 void ExistingUser()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("@@+++++++++++ WELCOME TO OUR ONLINE BANKING APPLICATION ++++++++++++++++@@");
			System.out.println("ENTER YOUR NAME : ");
			Customer_Name=sc.next();
			System.out.println("ENTER YOUR ID : ");
			Customer_Id=sc.nextInt();
			System.out.println("ENTER YOUR ACCOUNT NO : ");
			Account_No=sc.nextInt();
			Show_Menu();
		}
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	void Show_Menu()
	{
		char option = '\0';
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Welcome  " +Customer_Name);
		System.out.println(" Your ID is :  "+Customer_Id);
		System.out.println(" Your ACCOUNT No. is :  "+Account_No);
		System.out.println(" \n ");
		System.out.println(" CHOOSE ANY ONE AT A TIME ");
		System.out.println(" \n ");
		System.out.println("A.  CHECK BALANCE");
		System.out.println("B.  DEPOSIT AMOUNT");
		System.out.println("C.  WITHDRAW AMOUNT");
		System.out.println("D.  CHECK PREVIOUS TRANSECTION");
		System.out.println("E.  EXIT");
		System.out.println("F.  CALCULATE INTEREST ");
		
		do
		{
			System.out.println("******************************************************************************");
			System.out.println("ENTER ANY OPTION ");
			System.out.println("******************************************************************************");
			option = sc.next().charAt(0);
			System.out.println(" \n ");
			
			switch(option)
			{
			case 'A':
				System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££");
				System.out.println("BALANCE =  " +Balance);
				System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££");
				System.out.println(" \n ");
				break;
				
			case 'B':
				System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££");
				System.out.println("ENTER AN AMOUNT TO DEPOSIT : ");
				System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££");
				int amount=sc.nextInt();
				Deposit(amount);
				System.out.println("SUCCESSFULLY DEPOSITED..");
				System.out.println(" \n ");
				break;
				
			case 'C':
				System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££");
				System.out.println("ENTER AN AMOUNT TO WITHDRAW  : ");
				System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££");
				int amount2=sc.nextInt();
				Withdraw(amount2);
				System.out.println("SUCCESSFULLY WITHDRAWN FROM YOUR ACCOUNT ..");
				System.out.println(" \n ");
				break;
				
			case 'D':
				System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££");
				get_Previous_Transection();
				System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££");
				System.out.println(" \n ");
				break;
				
			case 'E':
				System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££");
				break;
				
			case 'F':
				System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££");
				Calculate_Interest();
				System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££");
				System.out.println(" \n ");
				break;
				
		    default:
		    	System.out.println("SORRY!!!! ");
		    	System.out.println("INVALID OPTION!!!!! ");
		    	System.out.println("PLEASE ENTER AGAIN... ");
		    	break;
				
				}
			}
		while(option!= 'E');
		System.out.println(" THANK YOU FOR USING OUR ONLINE BANKING APPLICATION SERVICES..");
		
	}
}

public class SimpleBankingApp 
{

	public static void main(String[] args) 
	{
		BankAccount BA= new BankAccount();
		
		BA.show();

	}

}
