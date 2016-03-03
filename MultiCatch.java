import java.io.*;
import java.util.*;
class MultiCatch

{
	public static void main(String args[])
{
int x,z;

Scanner in=new Scanner(System.in);
System.out.println("Enter number: ");

x=in.nextInt();
try
{
	z=50/x;
	System.out.println("Division :" +z);
	short arr[]={5,7,8};
	arr[10]=120;
	System.out.println("try end...");
}
catch(ArithmeticException e)
{
	System.out.println("Division by zero");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array indexing wrong");
}
System.out.println("Program end");
}
}
