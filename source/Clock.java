
public class Clock extends Thread{
	public void run(){
		while(true) {
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(Log.Minute<60) {
				Log.Minute+=1;
				if(Log.Minute>9) {
					StepLog.minute.setText(Integer.toString(Log.Minute));
					HeartRateLog.minute.setText(Integer.toString(Log.Minute));
					CalorieLog.minute.setText(Integer.toString(Log.Minute));
					}
				else {
					StepLog.minute.setText("0"+Integer.toString(Log.Minute));
					HeartRateLog.minute.setText("0"+Integer.toString(Log.Minute));
					CalorieLog.minute.setText("0"+Integer.toString(Log.Minute));
				}
			}else if(Log.Hour==12 && Log.AMPM.equals("AM")){
				Log.Hour=1;
				Log.AMPM = "PM";
				Log.Minute=0;
				StepLog.hour.setText(Integer.toString(Log.Hour));
				if(Log.Minute>9) {
					StepLog.minute.setText(Integer.toString(Log.Minute));
					HeartRateLog.minute.setText(Integer.toString(Log.Minute));
					CalorieLog.minute.setText(Integer.toString(Log.Minute));
					}
				else {
					StepLog.minute.setText("0"+Integer.toString(Log.Minute));
					HeartRateLog.minute.setText("0"+Integer.toString(Log.Minute));
					CalorieLog.minute.setText("0"+Integer.toString(Log.Minute));
				}
				StepLog.ampm.setText(Log.AMPM);
				HeartRateLog.hour.setText(Integer.toString(Log.Hour));
				HeartRateLog.ampm.setText(Log.AMPM);
				CalorieLog.hour.setText(Integer.toString(Log.Hour));
				CalorieLog.ampm.setText(Log.AMPM);
			} else if(Log.Hour==12 && Log.AMPM.equals("PM")){
				Log.Hour=1;
				Log.AMPM = "AM";
				Log.Minute=0;
				StepLog.hour.setText(Integer.toString(Log.Hour));
				if(Log.Minute>9) {
					StepLog.minute.setText(Integer.toString(Log.Minute));
					HeartRateLog.minute.setText(Integer.toString(Log.Minute));
					CalorieLog.minute.setText(Integer.toString(Log.Minute));
					}
				else {
					StepLog.minute.setText("0"+Integer.toString(Log.Minute));
					HeartRateLog.minute.setText("0"+Integer.toString(Log.Minute));
					CalorieLog.minute.setText("0"+Integer.toString(Log.Minute));
				}
				StepLog.ampm.setText(Log.AMPM);
				HeartRateLog.hour.setText(Integer.toString(Log.Hour));
				HeartRateLog.ampm.setText(Log.AMPM);
				CalorieLog.hour.setText(Integer.toString(Log.Hour));
				CalorieLog.ampm.setText(Log.AMPM);
			}else {
				Log.Hour+=1;
				Log.Minute=0;
				StepLog.hour.setText(Integer.toString(Log.Hour));
				StepLog.hour.setText(Integer.toString(Log.Hour));
				if(Log.Minute>9) {
					StepLog.minute.setText(Integer.toString(Log.Minute));
					HeartRateLog.minute.setText(Integer.toString(Log.Minute));
					CalorieLog.minute.setText(Integer.toString(Log.Minute));
					}
				else {
					StepLog.minute.setText("0"+Integer.toString(Log.Minute));
					HeartRateLog.minute.setText("0"+Integer.toString(Log.Minute));
					CalorieLog.minute.setText("0"+Integer.toString(Log.Minute));
				}
				StepLog.ampm.setText(Log.AMPM);
				HeartRateLog.hour.setText(Integer.toString(Log.Hour));
				HeartRateLog.ampm.setText(Log.AMPM);
				CalorieLog.hour.setText(Integer.toString(Log.Hour));
				CalorieLog.ampm.setText(Log.AMPM);
			}
		}
	}
}
