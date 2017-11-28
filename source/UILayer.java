import java.awt.EventQueue;

public class UILayer{


		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Log.setTimeFrame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
	public static void switchToStepScreen() {
		Log.stepLogFrame.setVisible(true);
		Log.setTimeFrame.setVisible(false);
		Log.calorieLogFrame.setVisible(false);
	}
	public static void switchToHeartScreen() {
		Log.heartRateLogFrame.setVisible(true);
		Log.stepLogFrame.setVisible(false);
	}
	public static void switchToCalorieScreen() {
		Log.calorieLogFrame.setVisible(true);
		Log.heartRateLogFrame.setVisible(false);
}
}
