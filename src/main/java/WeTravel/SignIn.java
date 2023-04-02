package WeTravel;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;


public class SignIn {

    public static void main(String[] args){


        // Create ChromeOptions object
        ChromeOptions options = new ChromeOptions();
        // Set the window size
        options.addArguments("start-maximized");
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver(options);
        CoreData signInPage = new CoreData(driver);

        driver.get(CoreData.getSignInPage());
        signInPage.getSignInButton().click();
        signInPage.getEmailField().sendKeys("o.ramiz1@mail.ru");
        signInPage.getNextButton().click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        signInPage.getFirstNameField().sendKeys("Ramiz");
        signInPage.getLastNameField().sendKeys("Omarov");
        signInPage.getPasswordField().sendKeys("A123456!");
        //signInPage.getKeepLogIn().click();
        signInPage.getSignUpButton().click();
       // signInPage.getFirstNameField().send("Ramiz");

        //



    }



}
