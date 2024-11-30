package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class LoginFormTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless");
        driver = new EdgeDriver(options);
        driver.get("http://localhost:8080/login");
    }
    @Test
    public void testIncorrectCredentials() {
        WebElement nameField = driver.findElement(By.id("name"));
        WebElement surnameField = driver.findElement(By.id("surname"));
        WebElement driverIDField = driver.findElement(By.id("driverID"));
        WebElement phoneField = driver.findElement(By.id("phone"));
        WebElement submitButton = driver.findElement(By.cssSelector("button.submit-btn"));

        nameField.sendKeys("Mariia");
        surnameField.sendKeys("Lozovatska");
        driverIDField.sendKeys("L111111");
        phoneField.sendKeys("5553456781");

        submitButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("errorMessage")));
        assertTrue(errorMessage.isDisplayed());
    }



    @Test
    public void testValidInput() {
        WebElement nameField = driver.findElement(By.id("name"));
        WebElement surnameField = driver.findElement(By.id("surname"));
        WebElement driverIDField = driver.findElement(By.id("driverID"));
        WebElement phoneField = driver.findElement(By.id("phone"));
        WebElement submitButton = driver.findElement(By.cssSelector("button.submit-btn"));

        nameField.sendKeys("Mariia");
        surnameField.sendKeys("Lozovatska");
        driverIDField.sendKeys("L111111");
        phoneField.sendKeys("5553456789");

        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/welcome"));
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("/welcome"));
    }

    @Test
    public void testInvalidName() {
        WebElement nameField = driver.findElement(By.id("name"));
        WebElement surnameField = driver.findElement(By.id("surname"));
        WebElement driverIDField = driver.findElement(By.id("driverID"));
        WebElement phoneField = driver.findElement(By.id("phone"));
        WebElement submitButton = driver.findElement(By.cssSelector("button.submit-btn"));

        nameField.sendKeys("Mariia123");
        surnameField.sendKeys("Lozovatska");
        driverIDField.sendKeys("L111111");
        phoneField.sendKeys("5553456789");
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(nameField, "title"));
        String titleText = nameField.getAttribute("title");
        assertEquals("Only letters are allowed, max 50 characters", titleText);
    }

    @Test
    public void testInvalidSurname() {
        WebElement nameField = driver.findElement(By.id("name"));
        WebElement surnameField = driver.findElement(By.id("surname"));
        WebElement driverIDField = driver.findElement(By.id("driverID"));
        WebElement phoneField = driver.findElement(By.id("phone"));
        WebElement submitButton = driver.findElement(By.cssSelector("button.submit-btn"));

        nameField.sendKeys("Mariia");
        surnameField.sendKeys("Lozovatska123");
        driverIDField.sendKeys("L111111");
        phoneField.sendKeys("5553456789");
        submitButton.click();
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(surnameField, "title"));

        String titleText = surnameField.getAttribute("title");
        assertEquals("Only letters are allowed, max 50 characters", titleText);
    }

    @Test
    public void testInvalidDriverID() {

        WebElement nameField = driver.findElement(By.id("name"));
        WebElement surnameField = driver.findElement(By.id("surname"));
        WebElement driverIDField = driver.findElement(By.id("driverID"));
        WebElement phoneField = driver.findElement(By.id("phone"));
        WebElement submitButton = driver.findElement(By.cssSelector("button.submit-btn"));

        nameField.sendKeys("Mariia");
        surnameField.sendKeys("Lozovatska");
        driverIDField.sendKeys("L11111D");
        phoneField.sendKeys("5553456789");
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(driverIDField, "title"));
        String titleText = driverIDField.getAttribute("title");
        assertEquals("Must follow the format: D111111 (one letter followed by 6 digits)", titleText);
    }

    @Test
    public void testInvalidPhoneNumber() {
        WebElement nameField = driver.findElement(By.id("name"));
        WebElement surnameField = driver.findElement(By.id("surname"));
        WebElement driverIDField = driver.findElement(By.id("driverID"));
        WebElement phoneField = driver.findElement(By.id("phone"));
        WebElement submitButton = driver.findElement(By.cssSelector("button.submit-btn"));

        nameField.sendKeys("Mariia");
        surnameField.sendKeys("Lozovatska");
        driverIDField.sendKeys("L111111");
        phoneField.sendKeys("5553");
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(phoneField, "title"));
        String titleText = phoneField.getAttribute("title");
        assertEquals("Please enter exactly 10 digits (e.g., 1234567890)", titleText);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
