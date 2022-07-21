class PrivateAccessModifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class PrivateAccessModifiers {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		PrivateAccessModifier  obj = new PrivateAccessModifier(); 
        //trying to access private method of another class 
        //obj.display();

	}
}



