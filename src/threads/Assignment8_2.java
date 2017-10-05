package threads;

/*
 * Implement a class that checks whether a given number is a prime 
 * using both the Thread class and Runnable interface
 */

import java.util.Scanner;//Importing Scanner Class

class PrimeThread extends Thread// PrimeThread Class uses Thread class 
{
	public void run()
	{
		try
		{
		int temp;
		boolean isPrime=true;
		Scanner sc= new Scanner(System.in);//Creating object of Scanner Class
		System.out.println("Enter any number:");		
		int num=sc.nextInt();//user input in an integer
		sc.close();//Closing Scanner Object
		//Checking a number is prime or not
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
		Thread.sleep(50);
		}
		catch(Exception e) {}
	}
		
}
class PrimeRunnable implements Runnable//PrimeRunnable Class to shows Runnable interface
{
	public void run()
	{
		try
		{
		int temp;
		boolean isPrime=true;
		Scanner sc= new Scanner(System.in);//Creating object of Scanner Class
		System.out.println("Enter any number:");		
		int num=sc.nextInt();//user input in an integer
		sc.close();//Closing Scanner Object
		//Checking a number is prime or not
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
		}
		catch(Exception e1) {}
	}
}
public class Assignment8_2 
{
	public static void main(String[] args) //Start of Main Class
	{
		// TODO Auto-generated method stub
		try
		{
			new PrimeThread().start();//Calling Thread 
			PrimeRunnable p1=new PrimeRunnable();//Creating object of PrimeRunnable Class
			Thread t1=new Thread(p1);//Creating object of Thread
			t1.start();//Starting Thread
		}
		catch(Exception e2){}
	}//Close of Main Class
}
