package atm;

import java.util.Scanner;

class ATM
{
	public double Balance;
	public int Pin;
	
	public void checkpin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Pin to know your Account data");
		int yourpin=sc.nextInt();
		if(yourpin==Pin)
		{
			menu();
		}
		else
		{
			System.out.println("Please enter the correct pin");
		}
	}
	
	public void menu()
	{
		System.out.println("PRESS 1 -- TO KNOW ACCOUNT BALANCE");
		System.out.println("PRESS 2 -- TO WITHDRAW MONEY");
		System.out.println("PRESS 3 -- TO DEPOSIT MONEY");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter your choice amoung  1 2 3");
		int choice=sc.nextInt();
		
		if (choice==1)
		{
			accountbalance();
		}
		
		else if(choice==2)
		{
			withdraw();
		}
		
		else if(choice==3)
		{
			deposit();
		}
		else
		{
			System.out.println("Please enter valid choice");
		}
		
		
	}
	
	public void accountbalance()
	{
		System.out.println("Balance in your account is :"+Balance);
		menu();
	}
	
	public void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount that you wanted to withdraw :");
		double withdrawamount=sc.nextDouble();
		
		if(withdrawamount>Balance)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			Balance=Balance-withdrawamount;
			System.out.println("Successfully"+withdrawamount+"is reduced from your bank balance");
			System.out.println("Now your Bank balance is :"+Balance);
			
		}
		
		menu();
		
		
	}
	public void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount that you wanted to deposit");
		double depositamount=sc.nextDouble();
		Balance=depositamount+Balance;
		System.out.println("Now your Bank balance is :"+Balance);
		
		menu();
	}
	
	
}

public class ATMPROJECT {
	public static void main(String arg[])
	{
		ATM a1=new ATM();
		a1.Balance=100000;
		a1.Pin=1234;
		a1.checkpin();
		
	}

}
