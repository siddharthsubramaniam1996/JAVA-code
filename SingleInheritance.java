import java.io.*;
class First
{
int val;
void init()
{
BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
System.out.println(" input number");
{
try
{
val=Integer-parseInt(in.readline());
}
catch(IOException ioe)
{
ioe.printStackTrace();
}
}
int Square()
{
return(val*val);
}
}
class Second extends First
{
int mem;
int cube()
{
mem=square() * val;
return mem;
}
}
class SingleInheritance
{
public static void main(String args[])
{
Second s=new Second();
s.init();
System.out.println("cube: "+s.cube());
}
}
}