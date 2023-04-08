package WeTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class CreateTrip {
    //private final WebDriver driver;

//    public CreateTrip(WebDriver driver) {
//        this.driver = driver;
//    }
    public boolean perform(WebDriver driver)  {
        CoreData CreateTrip = new CoreData(driver);

        CreateTrip.getInputDestination().sendKeys("Toronto");
        CreateTrip.getNextStep().click();
        CreateTrip.getStartDateInput().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        CreateTrip.setStartDateInput().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        CreateTrip.getEndDateInput().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        CreateTrip.setStartDateInput().click();
        CreateTrip.getNextButtonSchedule().click();
        CreateTrip.getPrivateClickLabel().click();
        CreateTrip.getSeeTripNextClick().click();


        return true;
    }
}
