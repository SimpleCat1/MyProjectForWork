package Selenoid_4;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.and;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class SelenideWikiPageTests {
    private String urlSite = "https://github.com/selenide/selenide";
    private String junit5Text = "3. Using JUnit5 extend test class:";
    private By wikiNameLocator = byXpath("//span[@data-content='Wiki']");
    private By softAssertionLocator = byXpath("//a[text()='Soft assertions']");
    private By junit5Locator = byXpath("//h4[text()='3. Using JUnit5 extend test class:']");

    @Test
    public void WikiPage_followToJunit5Code_TextJunit5IsBe() {
        System.setProperty("selenide.browser", "Firefox");
        Configuration.startMaximized = true;
        open(urlSite);
        element(wikiNameLocator).shouldBe((and("Clickable", visible, enabled)));
        element(wikiNameLocator).click();
        element(softAssertionLocator).shouldBe((and("Clickable", visible, enabled)));
        element(softAssertionLocator).click();
        element(junit5Locator).shouldHave(text(junit5Text));
    }
}
