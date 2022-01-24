package assgn;

public class student extends person {
	static int roll;
	static String branch;
student(int r,String b)
{
	super(name,age);
    roll=r;
    branch=b;
}
void display()
{
	super.display();
	System.out.println("rollno:"+roll+"\nbranch:"+branch);
}
}
