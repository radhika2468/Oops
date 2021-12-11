//constructors are pre defined methods in java that are call by themselves at the time of execution.
//they are used to define some properties in advance at the time of creation of the program only.
class rectangle
{
    private double length;
    private double breadth;
    public rectangle()
    {
        length =1;
        breadth=1;
    }
    public rectangle(double  l, double b)
    {
        length =l;
        breadth=b;
    }
    public rectangle(double s)
    {
        length=breadth=s;
    }
    int public area()
   {
    System.out.println("area is "+ l*b);
    }
}
public class rectangletesting()
{
    public static void main(String args[])
    {
        rectangle r1=new rectangle();
        rectangle r2=new rectangle(5,10);
        rectangle r3=new rectangle(6);
    }
}
