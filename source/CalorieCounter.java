
public class CalorieCounter {

	static public int getData() {
		int totalHeartRate=0;
		for(int i=0; i<HeartRateLog.heartRateHistoryToday.size(); i+=1) {
			totalHeartRate+=HeartRateLog.heartRateHistoryToday.get(i);
		}
		return (int) (((20.0*0.2017)-(181.0*0.05741)+(totalHeartRate*0.6309)-55.0969)*((HeartRateLog.heartRateHistoryToday.size()*5.0)/4.184));
	}
}
