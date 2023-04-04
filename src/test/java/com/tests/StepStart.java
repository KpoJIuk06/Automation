package com.tests;

import WeTravel.CoreData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;

public class StepStart {
    private ChromeDriver driver;
    private WebDriverWait wait;

    private String currentWindow;

    @BeforeClass
    public void setupDriver(){

        // Create ChromeOptions object
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        // Set the window size
        options.addArguments("start-maximized");
        options.addArguments("--remote-debugging-port=9222");
        //options.setCapability("maxSession", 1);
        // Create a new instance of the ChromeDriver
        //WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new RemoteWebDriver(new URL("http://172.105.104.218:4444/"), options);
        CoreData Google = new CoreData(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @Test
    public void CreateAccountandTrip(){
        navigateToSignPage();
    }

    @Step
    public void navigateToSignPage(){
        AlphaLoginPage alphaLoginPage = new AlphaLoginPage(driver, wait);

        driver.get("http://172.105.104.218:4444/");
        driver.manage().window().maximize();
        //entry page
        alphaLoginPage.goToAsanLoginPage();
        //handle current window
        currentWindow = driver.getWindowHandle();
    }

    @AfterTest
    public void closeDriver(){
        driver.quit();
    }

}
