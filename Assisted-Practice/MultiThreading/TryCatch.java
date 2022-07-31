package MultiThreading;


public class TryCatch 
{
    public static void main(String args[]) 
    {
        int[] a = new int[5];
        try 
        {
            a[10] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!!!!;(("); 
        }
        finally 
        {
            System.out.println("The array is of size " + a.length);
        }
    }
}
