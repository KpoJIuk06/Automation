package WeTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Google {
    public static void main(String[] args) throws MalformedURLException {


        // Create ChromeOptions object
        ChromeOptions options = new ChromeOptions();
        // Set the window size
        options.addArguments("start-maximized");
        // Create a new instance of the ChromeDriver
        //WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new RemoteWebDriver(new URL("https://6bb1-37-26-18-160.ngrok.io"), options);
        CoreData Google = new CoreData(driver);
        driver.get(CoreData.getGooglePage());
        //driver.quit();
    }
}