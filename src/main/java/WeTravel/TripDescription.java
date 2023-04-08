package WeTravel;


import org.openqa.selenium.WebDriver;

public class TripDescription {

    public boolean perform(WebDriver driver) throws InterruptedException{
        CoreData TripDescription = new CoreData(driver);
        TripDescription.getTripDescriptionAbout().sendKeys("General Information");
        return true;
    }
}
