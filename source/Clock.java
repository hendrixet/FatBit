
public class Clock extends Thread{
	public void run() {
		
		if(Log.Minute<59) {
			Log.Minute+=1;
			
		}
	}
}
