import java.io.*;
import java.util.*;

public class Replace
{
	public static void main(String [] args)
	{
		String totest[];
		int i;
		String test="She is a Hot girl";
		String newString="";
		StringTokenizer st= new StringTokenizer(test);

	while(st.hasMoreTokens())
	{
		String temp=st.nextToken();
		if( temp.equals("a")==true)
		newString=newString+"the ";
		else
		newString= newString+ temp + " ";
		
	}
	System.out.println(newString);

	}
}
