import static org.junit.jupiter.api.Assertions.*;

import java.awt.EventQueue;
import java.awt.Frame;

import org.junit.jupiter.api.Test;

class StepLogTest {

	@Test
	void test() {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						StepLog frame = new StepLog();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		
			fail("Not yet implemented");
	
		
	}

}
