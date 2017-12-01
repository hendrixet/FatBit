import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.awt.EventQueue;
import java.awt.Frame;


class CalorieLogTest {
    CalorieLog frame;

    @Before
    public void setUp() throws Exception {
        frame = new CalorieLog();
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
        CalorieLogTest t = new CalorieLogTest();
        t.setUp();
        t.testView();
    }
}
