package WeTravel;

//import org.apache.logging.log4j.core.Core;
import org.openqa.selenium.WebDriver;

import java.time.Duration;



public class TripBasics {
   // private final WebDriver driver;

    //public TripBasics(WebDriver driver) {
      //  this.driver = driver;
    //}
    public boolean perform(WebDriver driver) throws InterruptedException {
        CoreData TripBasics = new CoreData(driver);

        TripBasics.getTripTitle().sendKeys("AllIneed");
        TripBasics.getTripOffered().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        TripBasics.setSelectOffer().click();
        TripBasics.getTripOffered().click();
        TripBasics.getSearchPhoto().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        TripBasics.setSearchPhoto().sendKeys("Cats");
        TripBasics.setSearchPhotoButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        TripBasics.setSearchPhotoElement().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        TripBasics.getViewSelectedPhoto().click();
        TripBasics.myMethod();
        TripBasics.getSelectedUploadPhoto().click();
        TripBasics.myMethod();
        TripBasics.getGroupMinimum().click();
        TripBasics.myMethod();
        TripBasics.setGroupMinimum().click();
        TripBasics.myMethod();
        TripBasics.getGroupMaximum().click();
        TripBasics.myMethod();
        TripBasics.setGroupMaximum().click();
        TripBasics.getPrivateCurrentClick().click();
        TripBasics.myMethod();
        TripBasics.getNextButtonTrip().click();

        return true;

    }
}
