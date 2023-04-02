package WeTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class CreateTrip {
    private final WebDriver driver;

    public CreateTrip(WebDriver driver) {
        this.driver = driver;
    }
    public boolean performActions() throws InterruptedException {
        CoreData CreateTrip = new CoreData(driver);

        CreateTrip.getInputDestination().sendKeys("Toronto");
        CreateTrip.getNextStep().click();
        CreateTrip.getStartDateInput().click();
        CreateTrip.myMethod();
        CreateTrip.setStartDateInput().click();
        CreateTrip.getEndDateInput().click();
        CreateTrip.myMethod();
        CreateTrip.setEndDateInput().click();
        CreateTrip.getNextButtonSchedule().click();
        CreateTrip.getPrivateClickLabel().click();
        CreateTrip.getSeeTripNextClick().click();


        return true;
    }
}
