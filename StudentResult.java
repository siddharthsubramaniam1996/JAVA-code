class StudentInfo
{
int rollno;
int marks1;
int marks2;
int total;
StudentInfo()
{
rollno=2;
marks1=40;
marks2=30;
}
int Total()
{
total=marks1+marks2;
return total;
}
void displayResult()
{
System.out.println(" vidyarthi cha roll number="+rollno);
System.out.println("pahile marka =" +marks1);
System.out.println("dusre marka =" +marks2);
System.out.println("ekun gun =" +total);
}
}
class StudentResult

{
public static void main(String args[])
{
int total1,total2,grandtotal;

StudentInfo student1= new StudentInfo();
StudentInfo student2= new StudentInfo();

total1=student1.Total();
total2=student2.Total();
grandtotal=total1+total2;


student1.displayResult();
student2.displayResult();

System.out.println("ekun gun =" +grandtotal);

}
}