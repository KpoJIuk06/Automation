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
        options.addArguments("--remote-allow-origins=*");
        // Set the window size
        options.addArguments("start-maximized");
        options.addArguments("--remote-debugging-port=9222");
        //options.setCapability("maxSession", 1);
        // Create a new instance of the ChromeDriver
        //WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new RemoteWebDriver(new URL("http://172.105.104.218:4444/"), options);
        CoreData Google = new CoreData(driver);
        driver.get(CoreData.getGooglePage());
        //driver.quit();
    }
}