package StepAllure;

import com.codeborne.selenide.junit5.TextReportExtension;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@ExtendWith({TextReportExtension.class})
public class GithubPageTests extends StepAllure.HelperFixture {
    StepAllure.HelperChecks check = new StepAllure.HelperChecks();
    StepAllure.HelperSteps step = new StepAllure.HelperSteps();
    private String textOnPage = "Issues";
    private By dropDownListLocator = byXpath("//summary[contains(text(),'Product')]");
    private By dropDownListChoiceLocator = byXpath("//summary[contains(text(),'Product')]/ancestor::details//li/a[contains(text(),'Issues')]");

    @Test
    @DisplayName("My Test Name")
    @Description("Some detailed test description")
    public void githubPage_LookForIssues_IssuesIs() {
        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });
        step.clickOnLocator(dropDownListLocator);
        check.checkTextLocator(dropDownListChoiceLocator, textOnPage);
    }
}
