package nov22;

public class Demonstration_107 {

	public static void main(String[] args) {
		try {
			int i=args.length;
			String  myString[] =new String[i];
			//System.out.println("first word is java");
			myString[0]=args[0];
			if (myString[0].equals("java")) {
				System.out.println("first word is java");
			//}
			System.out.println("number of arguments of =" + i);
		//int x=12/i;
		//int y[]= {555,999};
		//y[i]=x;
		}
		}
		catch(ArithmeticException e) {
			System.out.println("div by 0:"+ e);
		}
		catch(NullPointerException e) {
			System.out.println("A null pointer exception:"+ e);
	}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of bound exception"+ e);
		}

	}
}
