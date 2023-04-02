package WeTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainFlow {
    private final WebDriver driver;

    public MainFlow(WebDriver driver) {
        this.driver = driver;
    }

    public void run() {
        LogIn login = new LogIn();
        boolean loginSuccess = login.performActions(driver);

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

                // Continue with the rest of your flow
            } else {
                // Handle the case where CreateTrip failed
            }
        } else {
            // Handle the case where LogIn failed
        }
    }
    public static void main(String[] args) {
        // Create ChromeOptions object
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        // Set the window size
        options.addArguments("start-maximized");
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver(options);
        MainFlow mainFlow = new MainFlow(driver);
        mainFlow.run();
    }
}
