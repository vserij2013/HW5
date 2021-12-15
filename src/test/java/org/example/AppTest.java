package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AppTest
{
    static WebDriver driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        Assertions.assertDoesNotThrow( ()-> driver.navigate().to("https://diary.ru"), "Страница недоступна");
    }

    @Test
    void SignUp() {
        WebElement webElement = driver.findElement(By.linkText("Регистрация"));
        Actions actions = new Actions(driver);
        actions
                .click(webElement)
                .build()
                .perform();

        WebElement webElement1 = driver.findElement(By.id("signupform-username"));
        Actions actions1 = new Actions(driver);
        actions1
                .click(webElement1)
                .sendKeys("Applanatest1")
                .build()
                .perform();

        WebElement webElement2 = driver.findElement(By.id("signupform-password"));
        Actions actions2 = new Actions(driver);
        actions2
                .click(webElement2)
                .keyDown(Keys.SHIFT)
                .sendKeys(Keys.HOME)
                .keyUp(Keys.SHIFT)
                .sendKeys("Student2020!")
                .build()
                .perform();

        WebElement webElement3 = driver.findElement(By.id("signupform-email"));
        Actions actions3 = new Actions(driver);
        actions3
                .click(webElement3)
                .sendKeys("vs346751@gmail.com")
                .build()
                .perform();

        WebElement webElement4 = driver.findElement(By.id("chk_box_user_confirm"));
        Actions actions4 = new Actions(driver);
        actions4
                .clickAndHold(webElement4)
                .release()
                .build()
                .perform();

        WebElement webElement5 = driver.findElement(By.id("signup_btn"));
        Actions actions5 = new Actions(driver);
        actions5
                .click(webElement5)
                .build()
                .perform();
    }

    @Test
    void CreateProject() {
        WebElement webElement6 = driver.findElement(By.xpath("//li[2]/a/span"));
        Actions actions = new Actions(driver);
        actions
                .click(webElement6)
                .build()
                .perform();

        WebElement webElement7 = driver.findElement(By.id("newblogform-title"));
        Actions actions1 = new Actions(driver);
        actions1
                .click(webElement7)
                .sendKeys("453353453")
                .build()
                .perform();

        WebElement webElement8 = driver.findElement(By.xpath("//div[4]/label/input"));
        Actions actions2 = new Actions(driver);
        actions2
                .click(webElement8)
                .build()
                .perform();

        WebElement webElement9 = driver.findElement(By.name("new-blogs-button"));
        Actions actions3 = new Actions(driver);
        actions3
                .click(webElement9)
                .build()
                .perform();
    }
}