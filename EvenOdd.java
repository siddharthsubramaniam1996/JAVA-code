import java.lang.*;
class Even extends Thread
{
	public void run()
	{
	try
	{
	for (int i=2;i<=10;i=i+2)
	{
	
		System.out.println("\t Even thread :" +i);
		Thread.sleep(500);
}
}
catch(InterruptedException e)
{}
}
}
class Odd extends Thread
{
public void run()
{
try
{

for(int i=1;i<10;i=i+2)
{
System.out.println("\t Odd threads: " +i);
Thread.sleep(500);
}
}
catch(InterruptedException e)
{}
}
}
class EvenOdd

{
public static void main (String args[])
{
new Even().start();
new Odd().start();
System.out.println("Exit from main");
 
}
}
