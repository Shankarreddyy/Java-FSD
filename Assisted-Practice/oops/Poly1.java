package oops;
class Poly1 
{
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
        Poly1 s = new Poly1(); 
        System.out.println(s.sum(1, 20)); 
        System.out.println(s.sum(1, 2, 3)); 
        System.out.println(s.sum(1.5, 2.5)); 
    } 
}
