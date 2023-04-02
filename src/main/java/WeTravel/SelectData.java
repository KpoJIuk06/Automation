package WeTravel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


public class SelectData {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        String month = "March 2023";
        String day = "20";

        // Create ChromeOptions object
        ChromeOptions options = new ChromeOptions();
        // Set the window size
        options.addArguments("start-maximized");
        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver(options);
        CoreData SelectData = new CoreData(driver);

        driver.get(CoreData.getSignInPage());
        SelectData.getSignInButton().click();
        SelectData.getEmailField().sendKeys("o.ramiz@mail.ru");
        SelectData.getNextButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        SelectData.getPasswordField().sendKeys("A123456!");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        SelectData.getClickCheckButton().click();
        SelectData.getLoginButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        SelectData.openCreateYourTripInNewTab();
        SelectData.getInputDestination().sendKeys("Toronto");
        SelectData.getNextStep().click();
        SelectData.getStartDateInput().click();
        Thread.sleep(2000);
           while (true)
        {
            String text=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div/strong")).getText();
            if(text.equals(month))
            {
                break;
            }
            else {
                driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]")).click();
            }
        }
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr/td[contains(text(), "+day+")]")).click();
        // select the second date
        SelectData.getEndDateInput().click();
        Thread.sleep(2000);
        SelectData.setEndDateInput().click();
        SelectData.getNextButtonSchedule();
    }



}
