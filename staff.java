package assgn;

public class staff extends employee {
	 String doj;
    staff(String d)
	{
		super(name,ecno);
		doj=d;
	}
	 void display()
	{
		super.display();
		System.out.println("date of joining:"+doj);
	}
}

