class twodim
{
final static int r=9;
final static int c=9;
public static void main(String args[])
{
int mult[] []=new int [r] [c];
int r,c;
int i,j;
for (i=1;i<=r;i++)
{
for(j=1;j<=c;j++)
{
mult[i][j]=i*j;
System.out.println(" " +mult[i][j]);


}
}
System.out.println("  ");
}

}