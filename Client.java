import java.util.*;
import java.io.*;

public class Client
{
	public static void main(String args[]) throws NumberFormatException
	{
 		try
        {
         BufferedReader in = new BufferedReader(new FileReader("input.txt"));
         String s1,s3;
         String s[],s2[];

        	for(int i=0 ; i<10 ; i++)
        	{
        		s1 = in.readLine();
        		s = s1.split(",");
        		User user = new User(s[0]);
				String handler = s[1];
				String emotion = s[2];
				Follower f1 = new Follower(user,handler,emotion);
        	}
			
		
        }
         

         catch(Exception e)
		{e.printStackTrace();}
	}
}
