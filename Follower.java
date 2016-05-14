import java.util.*;

public class Follower extends Observer
{
	private String handler,emotion;
	private int happyc=0;
	private int sadc=0;
	private int angryc=0;
	private int crazyc=0;
	private int goodc=0;
	private int badc=0;

	
	public Follower(User u,String handler,String emotion)
	{
		user = u;
		this.handler = handler;
		this.emotion = emotion;
		user.attach(this);
	}
	
	  		 	
	Scanner in = new Scanner(System.in);
	String text = in.next();
	String[] s = text.split("//s+");
	int len = s.length;	
	
	@Override
	public void update()
	{
		String []A = user.getHandlerAndEmotion();

			
			if(s[len-1] == "#Happy" && A[2] == s[len-1])
			{
				happyc++;
			}
			else if(s[len-1] == "#Sad" && A[2] == s[len-1])
			{
				sadc++;
			}
			else if(s[len-1] == "#Angry" && A[2] == s[len-1])
			{
				angryc++;
			}
			else if(s[len-1] == "#Good" && A[2] == s[len-1])
			{
				goodc++;
			}
			else if(s[len-1] == "#Bad" && A[2] == s[len-1])
			{
				badc++;
			}
			else if(s[len-1] == "#Crazy" && A[2] == s[len-1])
			{
				crazyc++;
			}		

		if(happyc > sadc && happyc > angryc && happyc > goodc && happyc > badc && happyc > crazyc )
		 System.out.println(happyc);
  		else if(sadc > happyc && sadc > angryc && sadc > goodc && sadc > badc && sadc > crazyc ) 
  		 System.out.println(sadc);
  		else if(angryc > sadc && angryc > happyc && angryc > goodc && angryc > badc && angryc > crazyc ) 
  		 System.out.println(angryc);
  		else if(goodc > sadc && goodc > angryc && goodc > happyc && goodc > badc && goodc > crazyc )
  		 System.out.println(goodc);
  		else if(badc > sadc && badc > angryc && badc > goodc && happyc < badc && badc > crazyc ) 
  		 System.out.println(badc);
  		else if(crazyc > sadc && crazyc > angryc && crazyc > goodc && crazyc > badc && happyc < crazyc )
  		 System.out.println(crazyc);
  		 


	}
					
}

