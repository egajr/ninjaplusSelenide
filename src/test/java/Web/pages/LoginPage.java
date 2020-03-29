package Web.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class LoginPage {

    public LoginPage open() {
        Selenide.open("/login");
        return this;
    }

    public LoginPage with(String email, String senha) {
        //Identificar e preencher campos de login
        $("input[name=email]").setValue(email);
        $("#passId").setValue(senha);
        $(byText("Entrar")).click();
        return this;
    }

    public SelenideElement alert() {
        //Validar mensagem de erro
        return $(".alert span");
    }

    public void clearSession() {
        executeJavaScript("localStorage.clear()");
    }
}
