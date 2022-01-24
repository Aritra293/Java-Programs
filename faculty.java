package assgn;

public class faculty extends employee {
	String designation; 
	faculty(String d)
	{
		super(name,ecno);
		designation=d;
	}
	void display()
	{
		super.display();
		System.out.println("designation:"+ designation);
	}
}
