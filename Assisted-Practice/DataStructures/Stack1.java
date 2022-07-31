package DataStructures;

public class Stack1 {
	static final int MAX=1000;
	int  top;
	int a[]= new int[MAX];
	
	boolean isEmpty() {
		
		return top<0;
		
	}
	
	public Stack1() {
		//constructor
		top=-1;//default  stckas an empty;
	}
	
	//add an element to stack
	boolean push(int x) {
		if(top>=(MAX-1)) {
			System.out.println("Stackis Overflow");
			return false;
		}
		else {
			a[++top]=x;
			System.out.println(x+" Pushed insto stack");
			return true;
		}
	}
	
	//deletion of  elements

	int pop() {
		
		if(top<0) {
			System.out.println("Statck  is UNDERFLOW");
			return 0;
		}
		else {
			int x= a[top--];
			return x;
		}
		
	}
	
	public static void main(String[] args) {
		Stack1 s=  new Stack1();
		s.push(1);
		s.push(220);
		s.push(35);
		s.push(46);
		
		System.out.println(s.pop()+ " : Poped Out from stack");
	}

}
