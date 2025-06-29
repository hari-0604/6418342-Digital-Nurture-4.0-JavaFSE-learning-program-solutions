import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PerformanceTesterTest {

    @Test
    void testPerformTaskWithinTime() {
        PerformanceTester pt = new PerformanceTester();
        assertTimeout(java.time.Duration.ofMillis(1000), () -> pt.performTask());
    }
}