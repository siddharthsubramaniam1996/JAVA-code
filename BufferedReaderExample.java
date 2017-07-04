import java.io.*;
public class BufferedReaderExample
{
	public static void main(String args[])throws Exception
	{
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		System.out.println("Enter your name");
		String name=br.readLine();
		System.out.println("Enter your surname");
		String surname=br.readLine();
		System.out.printf("Welcome to your buffered reader program " + name + " " + surname);
	}
}