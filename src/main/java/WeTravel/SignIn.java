package WeTravel;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class SignIn {

    public static void main(String[] args) throws Exception {
        // Create ChromeOptions object
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        // Set the window size
        options.addArguments("--window-size=1920,1080");
        //options.addArguments("start-maximized");
        // Create a new instance of the ChromeDriver
        //WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new RemoteWebDriver(new URL("https://6bb1-37-26-18-160.ngrok.io"), options);
        driver.manage().window().maximize();
try {

    CoreData signInPage = new CoreData(driver);

    driver.get(CoreData.getSignInPage());
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    signInPage.getSignInButton().click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    signInPage.getEmailField().sendKeys("o.ramhhivdsa@mail.ru");
    signInPage.getNextButton().click();
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    signInPage.getFirstNameField().sendKeys("Ramiz");
    signInPage.getLastNameField().sendKeys("Omarov");
    signInPage.getPasswordField().sendKeys("A123456!");
    //signInPage.getKeepLogIn().click();
    signInPage.getSignUpButton().click();
    // signInPage.getFirstNameField().send("Ramiz");
    driver.quit();
}
catch (Exception exception){
    takeSnapShot(driver,"s1.jpg");
}
        //



    }

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile=new File(fileWithPath);

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);

    }

}
