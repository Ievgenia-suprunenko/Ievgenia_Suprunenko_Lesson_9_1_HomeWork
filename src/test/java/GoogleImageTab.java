import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleImageTab {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/evgenia/Downloads/chromedriver");

        WebDriver webDrivers = new ChromeDriver();
        webDrivers.get("https://www.google.com");
        WebElement link = webDrivers.findElement(By.name("q"));
        link.click();
        link.sendKeys("Apple");

        webDrivers.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement search = webDrivers.findElement(By.className("gNO89b"));
        search.click();

        WebElement images = webDrivers.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a"));
        images.click();

        boolean verify = webDrivers.findElement(By.xpath("//*[@id='hdtb-msb-vis']/div[2]")).isDisplayed();

    }
}
