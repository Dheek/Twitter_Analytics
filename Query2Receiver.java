public class Query2Receiver implements QueryReceiver extends Follower
{
	Follower f = new Follower();
	private int tweet_height_reaction;
	
	@Override
	public void readQuery() 
	{
		//System.out.println("Reading Query1");	
		//f.update();
		//tweet_height_reaction == f.max();	
		//System.out.println(f.max);
	}
}

