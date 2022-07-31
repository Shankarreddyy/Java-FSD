package MultiThreading;

public class Throw1
{
    public static void main(String[] args)
    {

        int S=45,R=0,rs;

        try
        {
            if(R==0)        
                throw(new ArithmeticException("OHH! we Can't divide by zero:(."));
            else
            {
                rs = S / R;
                System.out.print("\n\tThe result is : " + rs);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }

        System.out.print("\n\tEnd of program:(.");
    }


}
