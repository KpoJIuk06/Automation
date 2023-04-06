package WeTravel;


import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class LogIn {



    public boolean perform(WebDriver driver) {
        CoreData LoginPage = new CoreData(driver);
        //driver.get(CoreData.getGooglePage());
        driver.get("https://www.wetravel.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoginPage.getSignInButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoginPage.getEmailField().sendKeys("o.ramiz@mail.ru");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoginPage.getNextButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoginPage.getPasswordField().sendKeys("A123456!");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        LoginPage.getClickCheckButton().click();
        LoginPage.getLoginButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        LoginPage.openCreateYourTripInNewTab();
        return true;
    }



}
