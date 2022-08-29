package suites;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("A demo Test Suite")
@SelectPackages("test.smoketest")
@IncludeTags("smoke")
public class TestSuitClass {
}