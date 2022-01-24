package fileprgs;

import java.io.*;

public class demonstration_1213 {

	public static void main(String[] args) {
		RandomAccessFile file=null;
		try
		{
			file=new RandomAccessFile("rand.dat","rw");
			file.writeChar('X');
			file.writeInt(555);
			file.writeDouble(3.1412);
			file.seek(0);
			
			System.out.println(file.readChar());
			System.out.println(file.readInt());
			System.out.println(file.readDouble());
			
			file.seek(1);
			file.seek(file.length());

			file.seek(2);
			System.out.println();
			System.out.println(file.readInt());
			
			file.seek(3);
			System.out.println(file.readDouble());
			
			file.seek(file.length());
			file.writeBoolean(false);
			
			file.seek(4);
			System.out.println(file.readBoolean());
			file.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		}
	}