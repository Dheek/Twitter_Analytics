public class ReadQueryCommand implements Command
{
	private QueryReceiver queryreceiver;
    
    public ReadQueryCommand(QueryReceiver qr){
        this.queryreceiver=qr;
    }

    @Override
    public void execute() 
    {
        this.queryreceiver.readQuery();
    }
}


