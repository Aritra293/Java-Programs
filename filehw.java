package assignment;

import java.io.FileInputStream;
public class filehw {

	public static void main(String[] args) {
				try
				{
				FileInputStream fin=new FileInputStream("D:/file1.txt");
					int i=0,count=0;
					while((i=fin.read())!=-1)
					{
						System.out.print((char)i);
						if((char)i=='A'||(char)i=='E'||(char)i=='I'||(char)i=='O'||(char)i=='U'||(char)i=='a'||(char)i=='e'||(char)i=='i'||(char)i=='o'||(char)i=='u')
						{
						 count= count+1;
						}
					}
					fin.close();
					System.out.println("  no.of vowels:"+count);
				}
				catch(Exception e)
				{
					System.out.print(e);
				}
	}
}
	
	


