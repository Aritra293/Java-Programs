package nov22;
import java.util.*;
public class Permutations {

	public static void main(String[] args) {
		String str;
		int i,j,k,l;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		str=sc.next();
		l=str.length();
		System.out.println("the required permutations are:");
		for(i=0;i<l;i++)
		{
			for(j=0;j<l;j++)
			{
				for(k=0;k<l;k++)
					System.out.println(str.charAt(i)+""+str.charAt(j)+""+str.charAt(k));
			}
		}
	}

}
