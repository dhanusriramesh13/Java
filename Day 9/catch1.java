class Handling
{
public static void main(String args[])
{
int a=10,b=0;
int c;
try
{
c=a/b;
}
catch(ArithmeticException e)//Exception-->base class
{
System.out.println("error occured");
}
System.out.println("end of program");
}
}