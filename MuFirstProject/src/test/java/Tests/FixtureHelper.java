package Tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class FixtureHelper {
    @BeforeAll
    static void beforeAll(){
        System.setProperty("selenide.browser", "Firefox");
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://demoqa.com";
    }
}
