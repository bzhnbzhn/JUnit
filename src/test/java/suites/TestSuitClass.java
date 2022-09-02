package suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;
import test.SearchResultTest;

@Suite
@SuiteDisplayName("A demo Test Suite")
@SelectClasses(SearchResultTest.class)
public class TestSuitClass {
}