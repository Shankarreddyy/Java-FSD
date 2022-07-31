package oops;

public class ClassObj 
{  
    String name; 
    String Gender; 
    int age; 
    String color; 
    public ClassObj(String name, String Male, int age, String color) 
    { 
        this.name = name; 
        this.Gender = Male; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String getBreed() 
    { 
        return Gender; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy Gender,age and color are " + this.getBreed()+", " + this.getAge()+ ", and"+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
        ClassObj scott = new ClassObj("Nani","Male", 5, "black"); 
        System.out.println(scott.toString()); 
    } 
}
