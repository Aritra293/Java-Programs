package assgn;

public class employee {
	static String name;
	static int ecno;
	employee(String n,int e)
	{
		name=n;
		ecno=e;
	}
	void display()
	{
		System.out.println("name:"+name +"\necno:"+ecno);
	}

}

