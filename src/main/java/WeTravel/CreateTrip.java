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
    public boolean perform(WebDriver driver) throws InterruptedException {
        CoreData CreateTrip = new CoreData(driver);
        CreateTrip.myMethod();
        CreateTrip.getInputDestination().sendKeys("Торонто, Онтарио, Канада");
        CreateTrip.myMethod();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
