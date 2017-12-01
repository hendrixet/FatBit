import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.awt.EventQueue;
import java.awt.Frame;


class HeartRateLogTest {
    StepLog frame;

    @Before
    public void setUp() throws Exception {
        frame = new StepLog();
    }

	@Test
	void testView() {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			fail("Not yet implemented");
	}

    public static void main(String[] args) throws Exception {
        HeartRateLogTest t = new HeartRateLogTest();
        t.setUp();
        t.testView();
    }
}
