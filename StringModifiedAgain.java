import java.lang.*;
class StringModifiedAgain
{
public static void main(String args[])
{
StringBuffer str=new StringBuffer ("Java Browser");
System.out.println("Original String:"+str);
System.out.println("Length of string:"+str.length());
for(int i=0;i<str.length();i++)
{
int p=i+1;
System.out.println("Charachter at position:"+p+" is  "+str.charAt(i));
}
String s1=new String(str.toString());
int pos=s1.indexOf("browser");
str.insert(pos,"Enabled");
System.out.println("Modified String:");
str.setCharAt(5,'-');
System.out.println("String now");
}

}
