package WeTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

//import java.time.Duration;
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
        return driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr/td[contains(text(), '22')]"));
    }
    public WebElement setStartDateInput() {
        return driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr/td[contains(text(), '14')]"));
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
