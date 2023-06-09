package com.tests;

import WeTravel.*;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeEach;
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

public class StepStartTest {
    private WebDriver driver;

    public StepStartTest(String ignoredCurrentWindow) {
    }

    @BeforeClass
    @Parameters("server_linode")
    public void setupDriver(String server_linode) throws MalformedURLException {

        // Create ChromeOptions object
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        // Set the window size
        options.addArguments("start-maximized");
        options.addArguments("--disable-dev-shm-usage");
        // Create a new instance of the ChromeDriver
        //driver = new ChromeDriver(options);
        driver = new RemoteWebDriver(new URL((server_linode)), options);
        CoreData Google = new CoreData(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @Test
    @Parameters("email")
    public void firstStepLoginTest(String email) throws InterruptedException {
        //simpleGooglePage();
        weTravelLoginPage(email);


    }
    @Test (dependsOnMethods = {"firstStepLoginTest"})
    public void secondStepCreateTripTest() throws InterruptedException{
        createTripStart();

    }
    @Test (dependsOnMethods = {"secondStepCreateTripTest"})
    public void thrirdStepTripBasicTest() throws InterruptedException{
        createTripBasics();

    }
    @Test (dependsOnMethods = {"thrirdStepTripBasicTest"})
    public void fourthStepTripDescTest() throws InterruptedException{
        descriptionData();
    }


    @Step
    public void weTravelLoginPage(String email) throws InterruptedException {
        LogIn logIn = new LogIn();
        Assert.assertTrue(logIn.perform(driver));
    }
    @Step
    public void simpleGooglePage() throws InterruptedException {
        Google simplePage = new Google();
        Assert.assertTrue(simplePage.perform(driver));
    }
    @Step
    public void createTripBasics() throws InterruptedException {
        TripBasics nextPage = new TripBasics();
        Assert.assertTrue(nextPage.perform(driver));

    }
    @Step
    public void createTripStart() throws InterruptedException{
        CreateTrip tripStart = new CreateTrip();
        Assert.assertTrue(tripStart.perform(driver));
    }
    @Step
    public void descriptionData() throws InterruptedException{
        TripDescription descData = new TripDescription();
        Assert.assertTrue(descData.perform(driver));
    }


    @AfterTest
    public void closeDriver(){
        //driver.quit();
    }

}
