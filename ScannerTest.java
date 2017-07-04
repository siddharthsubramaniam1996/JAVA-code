import java.util.Scanner;
class ScannerTest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your roll number: ");
		int rollno=sc.nextInt();
		
		System.out.println("Enter your Naav");
		String name=sc.next();
		
		System.out.println("Enter your fees ");
		double fee=sc.nextDouble();
	
	
		System.out.println(" Your rollno : " + rollno + " name : " + name + " and fees : " + " "+  fee);
		sc.close();
	}
}	