import java.lang.*;
class MyException extends Exception
{
MyException(String msg)
{
	super(msg);
}
}
class ExceptionTest
{
public static void main(String Args[])
{
BufferedReader bin=new BufferedReader(new InputStreamReader(System.in));
int x;
try
{
		System.out.println("Enter a number");
		x=Integer.parseInt(bin.readLine());
		if(x>0)
{
		throw new MyException("number is positive");
}
else
{
		throw new MyException("Number is negative");
}
}
catch(MyException e)
{
	System.out.println("e");
}
catch(IOException e)
{
	System.out.println("e");
}
}
}