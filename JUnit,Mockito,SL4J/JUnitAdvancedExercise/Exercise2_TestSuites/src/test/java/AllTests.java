import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({EvenCheckerTest.class, OrderedTests.class})
public class AllTests {
}