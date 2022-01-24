package internal;

public class Rectangle extends Circle {
		int l=0,b=0;
		double ar;
		public void input()
		{
			super.input();
			l=2;
			b=5;
		}
		public void area()
		{
			super.area();
			ar = l*b;
			System.out.println("Area of  rectangle:"+ar);
		}
		}



