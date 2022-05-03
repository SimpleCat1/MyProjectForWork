package StepAllure;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.element;

public class HelperChecks{

    @Step("Проверяем текст у элемента")
    protected void checkTextLocator(By locator, String text){
        element(locator).shouldHave(text(text));
    }
}
