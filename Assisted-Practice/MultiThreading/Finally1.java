package MultiThreading;

public class Finally1
{
    public static void main(String[] args)
    {
        int a1=5,b=0,r=0;
        try
        {
            r = a1 / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : " + r);
        }
    }
}
