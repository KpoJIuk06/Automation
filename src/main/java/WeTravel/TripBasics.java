package WeTravel;

import org.openqa.selenium.WebDriver;

import javax.swing.tree.TreePath;

public class TripBasics {
    private final WebDriver driver;

    public TripBasics(WebDriver driver) {
        this.driver = driver;
    }
    public boolean performActions() throws InterruptedException{
        CoreData TripBasics = new CoreData(driver);

        TripBasics.getTripTitle().sendKeys("AllIneed");
        TripBasics.getTripOffered().click();
        TripBasics.myMethod();
        TripBasics.setSelectOffer().click();
        TripBasics.getTripOffered().click();
        TripBasics.getSearchPhoto().click();
        TripBasics.myMethod();
        TripBasics.setSearchPhoto().sendKeys("Cats");
        TripBasics.setSearchPhotoButton().click();
        TripBasics.myMethod();
        TripBasics.setSearchPhotoElement().click();
        TripBasics.myMethod();
        TripBasics.getViewSelectedPhoto().click();
        TripBasics.myMethod();
        TripBasics.getSelectedUploadPhoto().click();
        TripBasics.myMethod();

        //komit
        //komit2
        return true;

    }
}
