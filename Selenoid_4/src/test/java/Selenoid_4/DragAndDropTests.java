package Selenoid_4;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.and;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class DragAndDropTests {
    private String urlSite = "https://the-internet.herokuapp.com/drag_and_drop";
    private By aNameLocator = byXpath("//div[@id='column-a']");
    private By bNameLocator = byXpath("//div[@id='column-b']");
    private By aPlaceAfterDragAndDropLocator = byXpath("//div[@id='column-a']/header[text()='B']");
    private By bPlaceAfterDragAndDropLocator = byXpath("//div[@id='column-b']/header[text()='A']");

    @Test
    public void dragAndDrop_DragAndDropAToB_BIsInAnotherPlace() {
        System.setProperty("selenide.browser", "Firefox");
        Configuration.startMaximized = true;
        open(urlSite);
        SelenideElement element1 = element(bNameLocator);
        element(aNameLocator).dragAndDropTo(element1);
        element(aPlaceAfterDragAndDropLocator).shouldBe((and("Clickable", visible, enabled)));
        element(bPlaceAfterDragAndDropLocator).shouldBe((and("Clickable", visible, enabled)));
//        element(bPlaceAfterDragAndDropLocator).exists(); этот метод не работает как ожидается
    }

//    @Test
//    public void action_DragAndDropAToB_BIsInAnotherPlace() {
//        System.setProperty("selenide.browser", "Firefox");
//        Configuration.startMaximized = true;
//        open(urlSite);
//        SelenideElement element = element(aNameLocator);
//        SelenideElement element1 = element(bNameLocator);
//        actions().click(element).moveToElement(element1,500,0).perform();
    // не работает...
//        element(aPlaceAfterDragAndDropLocator).exists();
//        element(bPlaceAfterDragAndDropLocator).exists();
//        sleep(5000);
//    }
}

