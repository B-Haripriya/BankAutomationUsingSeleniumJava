package com.test;

//package com.bank.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FundTransferTest{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/V4/");

        // 🔹 LOGIN
        driver.findElement(By.name("uid")).sendKeys("mngr643666");
        driver.findElement(By.name("password")).sendKeys("UgegUmE");
        driver.findElement(By.name("btnLogin")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Manager"));

        System.out.println("✅ Login Successful!");

        // 📸 Screenshot after login
        try {
            File loginScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(loginScreenshot.toPath(), new File("LoginSuccess.png").toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("📸 Screenshot captured: LoginSuccess.png");
        } catch (Exception e) {
            System.out.println("⚠️ Failed to capture login screenshot: " + e.getMessage());
        }

        // 🔹 NAVIGATE TO FUND TRANSFER PAGE
        try {
            WebElement fundTransferLink = driver.findElement(By.linkText("Fund Transfer"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fundTransferLink);
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fundTransferLink);
            System.out.println("✅ Navigated to Fund Transfer Page");
        } catch (Exception e) {
            System.out.println("⚠️ Navigation Failed: " + e.getMessage());
        }

        // 🔹 FILL FUND TRANSFER FORM
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("payersaccount")));
            driver.findElement(By.name("payersaccount")).sendKeys("130719");
            driver.findElement(By.name("payeeaccount")).sendKeys("130720");
            driver.findElement(By.name("ammount")).sendKeys("1000");
            driver.findElement(By.name("desc")).sendKeys("Academic Test Transfer");
            driver.findElement(By.name("AccSubmit")).click();
            System.out.println("✅ Fund Transfer Form Submitted Successfully!");
        } catch (Exception e) {
            System.out.println("⚠️ Fund Transfer Failed: " + e.getMessage());
        }

        // 🔹 HANDLE ALERT IF PRESENT
        try {
            Alert alert = driver.switchTo().alert();
            System.out.println("⚠️ Alert Message: " + alert.getText());
            alert.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("✅ No Alert Found — transfer likely successful.");
        }

        // 🔹 VALIDATION + SCREENSHOT
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='heading3']")));
            String successMsg = driver.findElement(By.xpath("//p[@class='heading3']")).getText();
            System.out.println("🟢 Result: " + successMsg);

            File fundTransferScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(fundTransferScreenshot.toPath(), new File("FundTransferResult.png").toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("📸 Screenshot captured: FundTransferResult.png");
        } catch (Exception e) {
            System.out.println("⚠️ Could not fetch confirmation message or capture screenshot: " + e.getMessage());
        }

        // 🔹 CLEAN EXIT
        driver.quit();
        System.out.println("✅ Test Completed and Browser Closed.");
    }
}

