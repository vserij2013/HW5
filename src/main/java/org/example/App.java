package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://diary.ru");

        WebElement webElement = driver.findElement(By.linkText("Регистрация"));
        webElement.click();

        WebElement webElement1 = driver.findElement(By.id("signupform-username"));
        webElement1.click();
        webElement1.sendKeys("Applanatest1");

        WebElement webElement2 = driver.findElement(By.id("signupform-password"));
        webElement2.click();
        webElement2.clear();
        webElement2.sendKeys("Student2020!");

        WebElement webElement3 = driver.findElement(By.id("signupform-email"));
        webElement3.click();
        webElement3.sendKeys("vs346751@gmail.com");

        WebElement webElement4 = driver.findElement(By.id("chk_box_user_confirm"));
        webElement4.click();

        WebElement webElement5 = driver.findElement(By.id("signup_btn"));
        webElement5.click();

        WebElement webElement6 = driver.findElement(By.xpath("//li[2]/a/span"));
        webElement6.click();

        WebElement webElement7 = driver.findElement(By.id("newblogform-title"));
        webElement7.click();
        webElement7.sendKeys("453353453");

        WebElement webElement8 = driver.findElement(By.xpath("//div[4]/label/input"));
        webElement8.click();

        WebElement webElement9 = driver.findElement(By.name("new-blogs-button"));
        webElement9.click();
    }
}
