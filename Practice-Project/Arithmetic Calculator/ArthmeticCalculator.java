import java.util.Scanner;
public class ArthmeticCalculator {

	public static void main(String[] args) {
		

			Scanner sc = new Scanner(System.in);
		    char Symbol;
		    Double n1, n2, result;
		    // ask users to enter operator
		    System.out.println("Enter Mentioned Arthematic Operators: +, -, *, or /");
		    Symbol = sc.next().charAt(0);

		    // ask users to enter numbers
		    System.out.println("Enter first number");
		    n1 = sc.nextDouble();

		    System.out.println("Enter second number");
		    n2 = sc.nextDouble();

		    switch (Symbol) {

		      // addition
		      case '+':
		        result = n1 + n2;
		        System.out.println(n1 + " + " + n2 + " = " + result);
		        break;

		      //subtraction
		      case '-':
		        result = n1 - n2;
		        System.out.println(n1 + " - " + n2 + " = " + result);
		        break;

		      // multiplication
		      case '*':
		        result = n1 * n2;
		        System.out.println(n1 + " * " + n2 + " = " + result);
		        break;

		      // division
		      case '/':
		        result = n1 / n2;
		        System.out.println(n1 + " / " + n2 + " = " + result);
		        break;

		      default:
		        System.out.println("Plaese Enter a VALID operator!");
		        break;
		    } 
	}

}
