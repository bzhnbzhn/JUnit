package test.smoketest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SmokeTest {
    @Tag("smoke")
    @Test
    @DisplayName("smoketest inside smoketest")
    public void smokeTest() {
    }
}
