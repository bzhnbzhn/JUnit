package suites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectPackages({"/Users/bazhan/Desktop/JUnit/src/test/java/smoketest"})
@Suite
@SuiteDisplayName("Smoke test")
@IncludeTags("smoke")
public class TestSuitClass {
}
