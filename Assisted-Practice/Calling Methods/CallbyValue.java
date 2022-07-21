
public class CallbyValue {
	int val=15;

	int operation(int val) {
		val =val/10;
		return(val);
	}

	public static void main(String args[]) {
		CallbyValue d = new CallbyValue();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
		}

}
