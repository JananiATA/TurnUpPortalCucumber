package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class wait {
    public static void waittobeclickable(WebDriver driver, String locatortype, String locatorvalue, int seconds) {
        var wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        if (locatortype.equals("xpath")) {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorvalue)));
        }
        if (locatortype == "id") {
            wait.until(ExpectedConditions.elementToBeClickable(By.id(locatorvalue)));
        }
        if (locatortype == "cssSelector") {
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locatorvalue)));
        }
        if (locatortype == "name") {
            wait.until(ExpectedConditions.elementToBeClickable(By.name(locatorvalue)));
        }
    }

    public static void waittobevisible(WebDriver driver, String locatortype, String locatorvalue, int seconds) {
        var wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        if (locatortype == "xpath") {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorvalue)));
        }
        if (locatortype == "id") {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorvalue)));
        }
        if (locatortype == "cssSelector") {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locatorvalue)));
        }
        if (locatortype == "name") {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorvalue)));
        }
    }


}



