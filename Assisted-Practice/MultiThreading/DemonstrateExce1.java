package MultiThreading;
class MyCustomException extends Exception{
	   String str1;
	   MyCustomException(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyCustomException Occurred: "+str1) ;
	   }
	}
	class DemonstrateExce1{
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyCustomException("This is My Error Message");
		}
		catch(MyCustomException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}

