package nov22;

public class Demonstration_108 {
	public static int j;

	public static void main(String[] args) {
		for(int i= 0;i<4;i++)
		try{
			switch(i)
			{

			case 0:
				int zero =0;
				j=999/zero;
				break;
			case 1:
				int b[] =null;
				j=b[0];
				break;
			case 2:
				int c[] =new int[2];
				j=c[10];
				break;
			
			}
		} 
		catch (Exception e){
				System.out.println("In test cases"+i+"\n");
				System.out.println(e.getMessage());
			}
			}
		}
		


