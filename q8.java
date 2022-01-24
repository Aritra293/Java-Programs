package nov22;

public class q8 {
	public static int j;

	public static void main(String[] args) {

				for(int i= 0;i<4;i++)
				try{
					switch(i)
					{

					case 0:
						int zero =0;
						j=999/zero;
						System.out.println("Arithmetic Exception");
						break;
					case 1:
						int c[] =new int[2];
						j=c[10];
						System.out.println("ArrayIndexOutOfBoundExcepton");
						break;
					}
				} 
				catch (Exception e){
						System.out.println("\nIn test cases"+i+"\n");
						System.out.println(e.getMessage());
					}
					}

				
				


	}


