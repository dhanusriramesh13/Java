package javafullproject;
class Handling
{
public static void main(String args[])
{
int a=10,b=0;
int c;
try
{
c=a/b;//------------->if there is any error,those exception will be thrown and catched //by catch block
}
catch(Exception e)//Exception is the class & e is the object
{
System.out.println("error occured");
}
System.out.println("end of program");
}
}
