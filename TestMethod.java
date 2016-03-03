public class BaseClass
{
public void methodToOverride()
{
System.out.println("I'm the method of BaseClass");
}
}
public class DerivedClass extends BaseClass
{
public void methodToOverride()
{
System.out.println("I'm the methid of DerivedClass");
}
}
public class TestMethod
{
public static void main(String args[])

{
BaseClass obj1 = new BaseClass();
BaseClass obj2= new DerivedClass();
obj1.methodToOverride();
obj2.methodToOverride();
}
}