abstract class AnonymousInnerClass {
	   public abstract void display();
	}


	public class InnerClass2 {

	public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {
		
	         public void display() {
	            System.out.println("Running Anonymous Inner Class");
	         }
	      };
	      i.display();

	   }
	}

