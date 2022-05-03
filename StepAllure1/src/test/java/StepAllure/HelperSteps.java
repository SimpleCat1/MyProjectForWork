package StepAllure;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.and;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class HelperSteps {

    @Step("Наводит на элемент нажимает ,и держит на нем")
    protected void clickOnLocator(By locator){
//        Actions actions = new Actions(driver);
        SelenideElement element = element(locator);
//        actions().
        actions().moveToElement(element).clickAndHold().build().perform();
//        actions().moveToElement(element).click(element1).perform();
//        element(locator).scrollTo();
//        element(locator).shouldBe((and("Clickable", visible, enabled)));
//        element(locator).click();
    }




}
