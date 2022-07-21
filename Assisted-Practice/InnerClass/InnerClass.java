public class InnerClass {

	 private String msg="Hey! Java"; 
	 
	 class Inner1{  
	  void Hey(){
		  System.out.println(msg+", Lets Go to ROCK the WORLD");
		  }  
	 }  


	public static void main(String[] args) {

		InnerClass obj=new InnerClass();
		InnerClass.Inner1 in=obj.new Inner1();  
		in.Hey();  
	}
}
