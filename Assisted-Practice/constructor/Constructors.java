class EmpInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

//parameterized constructor
class Student{
	int id;
	String name;

	Student(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class Constructors {
	public static void main(String[] args) {
		EmpInfo emp1=new EmpInfo();
		EmpInfo emp2=new EmpInfo();
		emp1.display();
		emp2.display();
		Student std1=new Student(55,"Shankar");
		Student std2=new Student(10,"Pawan");
		std1.display();
		std2.display();
		}
}