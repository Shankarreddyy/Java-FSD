
class DefaultAccessModifier {
	
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	} 

	public class DefaultAccessModifiers {

		public static void main(String[] args) {
			//default
			System.out.println("Dafault Access Specifier");
			DefaultAccessModifier obj = new DefaultAccessModifier(); 		  
	        obj.display(); 

		}
	}

