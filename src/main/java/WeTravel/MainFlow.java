package WeTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;


public class MainFlow {
    private final WebDriver driver;

    public MainFlow(WebDriver driver) {
        this.driver = driver;
    }

    public void run() {
        LogIn login = new LogIn();
        boolean loginSuccess = login.perform(driver);

        if (loginSuccess) {
            CreateTrip createTrip = new CreateTrip(driver);
            boolean createTripSuccess = false;
            try {
                createTripSuccess = createTrip.performActions();
            } catch (InterruptedException e) {
                // Handle the exception here, e.g. log the error
                e.printStackTrace();
            }

            if (createTripSuccess) {
             TripBasics tripBasics = new TripBasics(driver);
             boolean tripBasicssuccess = false;
             try {
                 tripBasicssuccess = tripBasics.performActions();
             } catch (InterruptedException e){
                 e.printStackTrace();
             }
                // Continue with the rest of your flow
            }
        }
    }
    public static void main(String[] args) throws MalformedURLException {
        // Create ChromeOptions object
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-dev-shm-usage");
        // Set the window size
        options.addArguments("start-maximized");
        // Create a new instance of the ChromeDriver
        //WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new RemoteWebDriver(new URL("http://8201-37-26-18-160.ngrok.io/wd/hub"), options);
        MainFlow mainFlow = new MainFlow(driver);
        mainFlow.run();
    }
}
