package org.example;




import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginpageByJenkeins {
    WebDriver driver;
    ChromeOptions options;

    @BeforeSuite
    public void openBrowser() {
        options= new ChromeOptions();
        options.addArguments("--start-maximized");
        driver=new ChromeDriver(options);
    }


        @Test(priority = 0,groups = {"Nagetive", "sanity","stage"})
                public  void login1(){
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("auto123@inclusion.com");
        driver.findElement(By.id("login-password")).sendKeys("Neha172#");
        driver.findElement(By.id("js-login-btn")).click();
        driver.findElement(By.id("login-username")).clear();

//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.page-heading")));
//        Assert.assertEquals(driver.getTitle(), "Dashboard");
//        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/dashboard");
//        driver.get("https://app.vwo.com/logout");

    }
    @Test(priority = 1,groups = {"Postive", "sanity","reg"})
    public  void login2() {
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("auto123@inclusion.com");
        driver.findElement(By.id("login-password")).sendKeys("Neha1702#");
        driver.findElement(By.id("js-login-btn")).click();

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.page-heading")));
        Assert.assertEquals(driver.getTitle(), "Dashboard");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/dashboard");
        driver.get("https://app.vwo.com/logout");
    }
    @AfterSuite
    public void teardown() {
        driver.quit();
    }


}