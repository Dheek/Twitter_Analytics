public class Query1Receiver implements QueryReceiver extends Follower
{
	Follower f = new Follower();
	private int emotion_highest_reaction;
	private int tweet_height_reaction;
	
	@Override
	public void readQuery() 
	{
		//System.out.println("Reading Query1");	
		f.update();
		emotion_highest_reaction == f.max();
		System.out.println(emotion_highest_reaction);	
	}
}

