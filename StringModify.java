import java.lang.*;
class StringModify
{
public static void main(String args[])
{
StringBuffer str=new StringBuffer("Siddharth Arun Venkatachalam Subramaniam");
System.out.println("Original Phrase:"+str);
System.out.println("Length of Phrase:" +str.length());
for(int i=0;i<str.length();i++)
{
int p=i+1;
System.out.println("Charachter at position: "+p+"  is "+str.charAt(i));
}
String s1=new String(str.toString());
int pos=s1.indexOf("browser");
str.insert(pos,"Enabled");
System.out.println("Modified String") ;
str.setCharAt(5,'-');
System.out.println("string now");
}
}