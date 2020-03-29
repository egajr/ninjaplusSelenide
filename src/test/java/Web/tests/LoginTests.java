package Web.tests;

import Web.common.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;

public class LoginTests extends BaseTest {

    @DataProvider(name = "login-alerts")
    public Object[][] loginProvider() {
        return new Object[][]{
                {"egajr@ninjaplus.com", "111111", "Usuário e/ou senha inválidos"},
                {"abc@ninjaplus.com", "242424", "Usuário e/ou senha inválidos"},
                {"", "242424", "Opps. Cadê o email?"},
                {"egajr@ninjaplus.com", "", "Opps. Cadê a senha?"}
        };
    }

    @Test
    public void shouldSeeLoggedUser() {
        login
                .open()
                .with("egajr@ninjaplus.com", "242424");
        side.loggedUser().shouldHave(text("Eder Junior"));

    }

    //DDT
    @Test(dataProvider = "login-alerts")
    public void shouldSeeLoginAlerts(String email, String pass, String expectAlert) {
        login
                .open()
                .with(email, pass)
                .alert().shouldHave(text(expectAlert));
    }

    @AfterMethod
    public void cleanUp() {
        login.clearSession();
    }
}