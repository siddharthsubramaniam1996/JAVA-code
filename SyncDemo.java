class SyncObj
{
void disp(String msg)
{
System.out.println("HELLO"+msg);
try
{
Thread.sleep(500);
}
catch (InterruptedException e)
{}
System.out.println("Exit from SyncObj");
}
}
class SyncTest implements Runnable
{
String z=" ";
Thread t;
SyncObj s;
SyncTest(SyncObj a,String b)
{
s=a;
z=b;
t=new Thread(this);
t start();
}
public void run()
{
synchronized(s)
{
s.disp(z);
}
}
}
class SyncDemo
{
public static void main(String args[])
{
SyncObj s=new SyncObj();
SyncTest s1=new SyncTest(s, "sneha");
SyncTest s2=new SyncTest(s, "Sujata");
}
}
