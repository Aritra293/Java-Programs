package fileprgs;

import java.io.FileOutputStream;

public class demonstration_123 {

	public static void main(String[] args) {
		try
		{
			FileOutputStream fout=new FileOutputStream("D:/file1.txt");
			String s="welcome to java";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("file waiting is over...");
		}
		catch(Exception e)
		{
			System.out.print(e);
		}

	}

}
