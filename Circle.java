package internal;

public class Circle implements shape
{
	int r=0;
	double pi = 3.14 , arc=0;
	public void input()
	{
		r=8;
	}
	public void area()
	{
		arc = pi * r *r;
		System.out.println("Area of the circle:"+arc);
	}
	}


