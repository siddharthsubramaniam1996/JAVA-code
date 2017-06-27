class sample
{
public static void main (String arg[])
	{
		int sum=0,n,rem;
		n=Integer.parseInt(arg[0]);
		while(n>0)

			{

				rem=n%10;
				sum=sum+rem;
				n=n/10;
			}



		
				System.out.println(" ");
				System.out.println("Sum of digits :"+sum);
				System.out.println(" ");
	}


}
