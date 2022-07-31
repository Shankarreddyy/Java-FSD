package MultiThreading;
public class CreatingThread extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		CreatingThread mt = new  CreatingThread();
  		mt.start();
 	}
}

