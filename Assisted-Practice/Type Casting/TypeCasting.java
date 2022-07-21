import java.util.Scanner;
public class TypeCasting {

	public static void main(String[] args) {
		//Explict TYPE CASTING
		double a;
		System.out.println("Explicit Type Casting:");
		System.out.println("Enter a Float Number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		int b=(int)a;
		System.out.println("Integer: "+b);
		/*----------------------------*/
		
		//Implict Type Casting
		System.out.println("Implicit Type Casting:");
		System.out.println("Enter a letter");
		char c;
		c=sc.next().charAt(0);
		int d=c;
		System.out.println("First Letter to int: "+d);
		double e=c;
		System.out.println("Value of E is "+e);
		long l=c;
		System.out.println("Value of L is "+l);

	}

}
