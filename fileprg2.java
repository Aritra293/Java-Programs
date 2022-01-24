package fileprgs;

	import java.io.FileInputStream;
import java.io.FileOutputStream;
	public class fileprg2 {
		public static void main(String[] args) {
			try
			{
				FileInputStream fin=new FileInputStream("D:/file1.txt");
				FileOutputStream fout=new FileOutputStream("D:/file1.txt");
				fout.write(66);
				fout.close();
				System.out.println("file waiting is over...");
				int i=0;
				while((i=fin.read())!=-1)
				{
					System.out.println((char)i);
				}
			}
			catch(Exception e)
			{
				System.out.print(e);
			}

	}
	}

