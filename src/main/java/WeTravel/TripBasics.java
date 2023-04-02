package WeTravel;

import org.openqa.selenium.WebDriver;

public class TripBasics {
    private final WebDriver driver;

    public TripBasics(WebDriver driver) {
        this.driver = driver;
    }
    public boolean performActions() throws InterruptedException{
        CoreData TripBasics = new CoreData(driver);

        TripBasics.getTripTitle().sendKeys("AllIneed");

        return true;

    }
}
