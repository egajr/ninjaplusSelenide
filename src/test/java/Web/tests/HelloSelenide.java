package Web.tests;

import Web.common.BaseTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.title;
import static org.testng.Assert.assertEquals;

public class HelloSelenide extends BaseTest {

    @Test
    public void OnAir() {
        login.open();
        assertEquals(title(), "Ninja+");
    }
}
