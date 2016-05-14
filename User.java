public class User 
{
	private Observer[] observers = new Observer[10];			  
	private String subscriber,handler,emotion;
	private int No_of_Observers=0;
	
	public User(String subscriber)
	{
		this.subscriber = subscriber;
	}

	public void attach(Observer o)
	{
		observers[No_of_Observers++] = o;
	}
	
	public String [] getHandlerAndEmotion()
	{
		String []A = new String[3];
		A[0] = subscriber;
		A[1] = handler;
		A[2] = emotion;
		return A;
	}
	
	public void setHandlerAndEmotion(String subscriber,String handler,String emotion)
	{
		this.handler = handler;
		this.subscriber = subscriber;
		this.emotion = emotion;
		notify_subscriber();
	}
	
	private void notify_subscriber()
	{
		for(int i=0;i<No_of_Observers;i++)
		{
			observers[i].update();
		}	
			
	}
}

