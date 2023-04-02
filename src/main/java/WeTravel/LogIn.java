package WeTravel;


import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class LogIn {

    public boolean performActions(WebDriver driver) {
        CoreData LoginPage = new CoreData(driver);

        driver.get(CoreData.getSignInPage());
        LoginPage.getSignInButton().click();
        LoginPage.getEmailField().sendKeys("o.ramiz@mail.ru");
        LoginPage.getNextButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoginPage.getPasswordField().sendKeys("A123456!");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        LoginPage.getClickCheckButton().click();
        LoginPage.getLoginButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        LoginPage.openCreateYourTripInNewTab();
        //LoginPage.getInputDestination().sendKeys("Toronto");
        return true;
    }



}
