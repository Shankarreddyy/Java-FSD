package MultiThreading;
class Exception11 extends Exception 
{ 
    public Exception11(String s) 
    { 
        super(s); 
    } 
} 
public class Exception1 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new Exception11("temp"); 
        } 
        catch (Exception11 ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
