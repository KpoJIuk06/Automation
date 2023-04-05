package com.tests;

import WeTravel.CoreData;
import WeTravel.Google;
import WeTravel.LogIn;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class StepStart {
    private WebDriver driver;
    private WebDriverWait wait;

    private String currentWindow;

    @BeforeClass
    public void setupDriver() throws MalformedURLException {

        // Create ChromeOptions object
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        // Set the window size
        options.addArguments("start-maximized");
        // Create a new instance of the ChromeDriver
        //driver = new ChromeDriver(options);
        driver = new RemoteWebDriver(new URL("http://172.105.104.218:4444/"), options);
        CoreData Google = new CoreData(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @Test
    @Parameters("email")
    public void CreateAccountandTrip(String email){
        //simpleGooglePage();
        weTravelLoginPage(email);

    }

    @Step
    public void weTravelLoginPage(String email){
        LogIn logIn = new LogIn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(logIn.perform(driver, email));
    }
    @Step
    public void simpleGooglePage(){
        Google simplePage = new Google();
        Assert.assertTrue(simplePage.perform(driver));
    }


    @AfterTest
    public void closeDriver(){
        //driver.quit();
    }

}
