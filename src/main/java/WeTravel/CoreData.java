package WeTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

//import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class CoreData {
    private final WebDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    public CoreData(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSignInButton() {
        return driver.findElement(By.xpath("//*[@id=\"travel-collapse\"]/div[1]/ul[1]/li[10]/a"));
    }
    public WebElement getNextButton() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Next')]"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("login_email"));
    }
    public WebElement getFirstNameField() {
        return driver.findElement(By.id("login_firstname"));
    }
    public WebElement getLastNameField(){
        return driver.findElement(By.id("login_lastname"));
    }
    public WebElement getPasswordField() {
        return driver.findElement(By.id("login_password"));
    }
       public  static String getSignInPage(){
        return "https://www.wetravel.com/";
    }
    public static String getGooglePage(){
        return "https://www.google.com/";
    }
    public WebElement getSignUpButton(){
        return driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div[2]/div/div/div[10]/div/a"));
    }
    public WebElement getLoginButton(){
        return driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div[2]/div/div/div[6]/div[1]/a"));
    }
    public WebElement getCreateYourTrip() {
        return driver.findElement(By.xpath("//a[@class='wt-button wt-button--orange wt-button--md topmenu__button--create']"));
    }
    public WebElement getInputDestination(){
        return  driver.findElement(By.xpath("(//input[@placeholder=\"What's the destination?\"])"));
    }
    public  WebElement getClickCheckButton(){
        return driver.findElement(By.xpath("(//label[contains(text(), 'Keep me logged in')])[1]"));
    }
    public WebElement getNextStep(){
        return  driver.findElement(By.id("next_step"));
    }
    public WebElement getStartDateInput(){
        return driver.findElement(By.id("stepOneStartDate"));
    }
    public WebElement getEndDateInput(){
        return driver.findElement(By.id("stepOneEndDate"));
    }

    public WebElement setEndDateInput(){
        return driver.findElement(By.xpath("//td[contains(@aria-label, \"It’s available.\")][2]"));
    }

    public WebElement setStartDateInput() {
        return driver.findElement(By.xpath("//td[contains(@aria-label, \"It’s available.\")][6]"));
    }
    public void myMethod() throws InterruptedException {
        Thread.sleep(2000);
    }
    public  WebElement getNextButtonSchedule(){
        return driver.findElement(By.xpath("//*[@id=\"next_step\"]"));
    }
    public  WebElement getPrivateClickLabel(){
        return driver.findElement(By.xpath("//label [@class='wt-text trip-privacy__label'][1]"));
    }
    public WebElement getSeeTripNextClick(){
        return driver.findElement(By.xpath("//*[@id=\"next_step\"]"));
    }
    public WebElement getTripTitle(){
        return driver.findElement(By.id("trip-title"));
    }
    public WebElement getTripOffered(){
        return driver.findElement(By.id("trip_offer"));
    }
    public WebElement setSelectOffer(){
        return driver.findElement(By.xpath("//*[@id=\"trip_offer\"]/option[2]"));
    }

    public WebElement getSearchPhoto(){
        return driver.findElement(By.id("search_photo"));
    }
    public WebElement setSearchPhoto(){
        return driver.findElement(By.xpath("//*[@id=\"__filestack-picker\"]/div/div/div[1]/div[2]/div[2]/div/div/div[1]/form/input"));
    }
    public WebElement setSearchPhotoButton(){
        return driver.findElement(By.xpath("//div [@class='fsp-icon fsp-image-search__submit-icon']"));
    }
    public WebElement setSearchPhotoElement(){
        return driver.findElement(By.xpath("//div [@class='fsp-grid__cell fsp-grid__cell--thumbnail'][3]"));
    }
    public WebElement getViewSelectedPhoto(){
        return driver.findElement(By.xpath("//span[@class='fsp-button fsp-button--primary']"));
    }
    public WebElement getSelectedUploadPhoto(){
        return driver.findElement(By.xpath("//span[@class='fsp-button fsp-button--primary fsp-button-upload']"));
    }
    public WebElement getGroupMinimum(){
        return driver.findElement(By.id("group_size_min"));
    }
    public WebElement setGroupMinimum(){
        return driver.findElement(By.xpath("//*[@id=\"group_size_min\"]/option[3]"));
    }
    public WebElement getGroupMaximum() {
        return driver.findElement(By.id("group_size_max"));
    }
    public WebElement setGroupMaximum(){
        return driver.findElement(By.xpath("//*[@id=\"group_size_max\"]/option[2]"));
    }
    public WebElement getPrivateCurrentClick(){
        return driver.findElement(By.xpath("//label [@class='wt-text trip-privacy__label trip-privacy__label--active']"));
    }
    public  WebElement getNextButtonTrip(){
        return driver.findElement(By.xpath("//a[contains(text(), 'Next')]"));
    }


    public void switchToNewTab() {
        // Get all open window handles
        Set<String> handles = driver.getWindowHandles();
        // Switch to new tab
        for(String handle : handles) {
            if (!handle.equals(driver.getWindowHandle())) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }
    public void openCreateYourTripInNewTab() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(getCreateYourTrip()).keyUp(Keys.CONTROL).perform();
        switchToNewTab();
    }

}
