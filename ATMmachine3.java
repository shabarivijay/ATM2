package Revisionn;
import java.util.Scanner;


public class ATMmachine3 

{     
	int pin = 1234;
	double accBal = 10000;
	String name="shabariVijay";
	
	static int verifyPin()
    {
		
	Scanner scn=new Scanner(System.in);
	System.out.println("\nplz enter the pin");
	int pin =scn.nextInt();
	return pin;
	
}
	
	

	void withdrawal()
	{
		Scanner scn=new Scanner(System.in);
		
				if(pin==ATMmachine3.verifyPin())
				{
					System.out.println("welcome "+name);
					System.out.println("\nplz enter the amount to be withdrawn");
					double withdrawalAmt=scn.nextDouble();
					if(withdrawalAmt<accBal)
					{
						System.out.println("transaction successful");
						accBal=accBal-withdrawalAmt;
						System.out.println("your accBal is="+accBal);
					}
					else
					{
						System.out.println("insufficient funds");
					}
				}
				else
				{
					System.out.println("\nincorrect password");
				}
		
		
	}
	
	void miniStatement()
	{
		
	
		
		if(pin==ATMmachine3.verifyPin())
		{
			System.out.println("\nwelcome "+name);
			System.out.println("\n(12-05-2018)your transaction=4500rs\n(15-05-2018)your transaction=8000rs\n(18-05-2018)your transaction=7900rs\n(29-05-2018)your transaction=10000rs\n(10-06-2018)your transaction=5000rs\n(15-06-2018)your transaction=10000rs\n");
			System.out.println("\n            your accountBalance ="+accBal);
		}
		else
		{
			System.out.println("\nincorrect password");
		}
	}
	
	void balanceEnquery()
	{
		
		Scanner scn=new Scanner(System.in);
		
		if(pin==ATMmachine3.verifyPin())
		{
			System.out.println("welcome "+name);
			System.out.println("your account balance ="+accBal);
			System.out.println("do u want reciept\n-yes\n-no");
			String reciept=scn.next();
			if("yes".equals(reciept)) 
			{
				System.out.println("wait.........\n");
				for(int i=0;i<2;i++)
				{
					System.out.println(" ");
				}
				System.out.println("collect the reciept");
			}
			else if("no".equals(reciept))
			{
				System.out.println("okay");
			}
			
		}
		else
		{
			System.out.println("\nincorrect password");
		}
		
	}

	public static void main(String[] args)
	{
		
	    Scanner scn=new Scanner(System.in);
	    ATMmachine3 atm=new ATMmachine3 ();
	    
		System.out.println("welcome to ATM");
		System.out.println("english\nkannada\nhindi");
		String language=scn.next();
		if("english".equals(language))
		{
			System.out.println("current");
			System.out.println("savings");
			String opt=scn.next();
			if("savings".equals(opt))
			{
				System.out.println("withdrawal\nbalanceEnquery\nminiStatement");
			
	     String enter=scn.next();
	     switch(enter)
	     {
	     case  "withdrawal":
	    	 atm.withdrawal();
	    	 break;
	    	 
	     case "balanceEnquery":
	    	 atm.balanceEnquery();
	    	 break;
	    	 
	     case "miniStatement":
	    	 atm.miniStatement();
	    	 break;
	      }
	    	}
			else if ("current".equals(opt))
			{
				System.out.println("current page");
			}
			

}
		else if("kannada".equals(language))
		{
			System.out.println("current");
			System.out.println("savings");
			String opt=scn.next();
			if("savings".equals(opt))
			{
				System.out.println("withdrawal\nbalanceEnquery\nminiStatement");
			
	     String enter=scn.next();
	     switch(enter)
	     {
	     case  "withdrawal":
	    	 atm.withdrawal();
	    	 break;
	    	 
	     case "balanceEnquery":
	    	 atm.balanceEnquery();
	    	 break;
	    	 
	     case "miniStatement":
	    	 atm.miniStatement();
	    	 break;
	      }
	    	}
			else if ("current".equals(opt))
			{
				System.out.println("current page");
			}
			

}
		else if("hindi".equals(language))
		{
			System.out.println("current");
			System.out.println("savings");
			String opt=scn.next();
			if("savings".equals(opt))
			{
				System.out.println("withdrawal\nbalanceEnquery\nminiStatement");
			
	     String enter=scn.next();
	     switch(enter)
	     {
	     case  "withdrawal":
	    	 atm.withdrawal();
	    	 break;
	    	 
	     case "balanceEnquery":
	    	 atm.balanceEnquery();
	    	 break;
	    	 
	     case "miniStatement":
	    	 atm.miniStatement();
	    	 break;
	      }
	    	}
			else if ("current".equals(opt))
			{
				System.out.println("current page");
			}
			

}
		}
}		
		
		
		
		
		
		
		
		
		
