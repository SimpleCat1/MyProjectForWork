package StepAllure;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class HelperFixture {
    @BeforeAll
    static void beforeAll(){

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        System.setProperty("selenide.browser", "Firefox");
        Configuration.startMaximized = true;
//        Configuration.baseUrl = "https://github.com";
    }
}
