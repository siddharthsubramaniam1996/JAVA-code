import java.util.*;
import java.lang.*;
class slip2
{
	public static void main (String args[])
	{
		Scanner sr=new Scanner(System.in);
		int i,j,size;
		String temp;
		System.out.println("enter the limit");
		size=sr.nextInt();
		String[]str=new String[size];
		System.out.println("Enter the cities name");
		for(i=0;i<size;i++)
			str[i]=sr.next();
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(str[j].compareTo(str[i])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}			
			for(i=0;i<size;i++)
				System.out.println(str[i]);
	}
	
}