package nov29;

public class demostration_109 {
	public static void main(String []args)
	{
		int i=0;
		String greetings[]= {"hello twinkle!","hello java!","hello world!"};
		while(i<4)
		{
			try
			{
				System.out.println(greetings[i]);
				i++;
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
			finally
			{
				System.out.println("hi!");
				if(i<3);
				else
				{
					System.out.println("you should quit and reset index value");
					break;
				}
				}
			}	
			}
}
