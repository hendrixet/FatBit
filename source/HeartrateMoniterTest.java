import org.junit.Test;

public class HeartrateMoniterTest {

    @Test
    public int testRange() throws Exception {
        int max = 0;
        for (int i = 0; i < 100; i++) {
            int bpm = HeartrateMoniter.getData();
            if ( bpm > max )
                max = bpm;
            if ( bpm > 240 )
                throw new Exception("Heartrate should not exceed 240 BPM");
        }
        
        return max;
    }

    public static void main(String[] args) throws Exception {
        HeartrateMoniterTest t = new HeartrateMoniterTest();
        int max = t.testRange();
        System.out.printf("Execution is clean, with max value read at %d\n", max);
    }
}
