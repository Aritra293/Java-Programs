package internal;

public class wrdcount implements wrdc {
	static int wordcount(String st)
	{
		int count=0;
		
		char ch[]=new char[st.length()];
		for(int i=0;i<st.length();i++)
		{
			ch[i]=st.charAt(i);
			  if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0))) 
				  count++;	  
		}
		return count;
	}
	public static void main(String[] args)
	{
		String st="India is best in cricket\n";
		System.out.println(st + wordcount(st)+ "  words.");
	}

}
