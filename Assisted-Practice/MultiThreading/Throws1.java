package MultiThreading;

public class Throws1
{
    void Division() throws ArithmeticException
    {
        int a=45,b=0,rs;
        rs = a / b;
        System.out.print("\n\t\tThe result is : " + rs);
    }
     public static void main(String[] args)
    {
    	 Throws1 TG = new Throws1();
         try
        {
            TG.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\t\tError:( : We cannot Divide( " + Ex.getMessage()+")");
        }
        System.out.print("\n\t\tEnd of program.");
    }
}

