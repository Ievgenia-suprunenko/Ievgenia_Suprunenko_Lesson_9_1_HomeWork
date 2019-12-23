import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Google {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/evgenia/Downloads/chromedriver");
        WebDriver webDrivers = new ChromeDriver();
        webDrivers.get("https://www.google.com/intl/uk/gmail/about/#");
        webDrivers.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement enter = webDrivers.findElement(By.xpath("//html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a"));
        enter.click();

        webDrivers.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement email = webDrivers.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
        webDrivers.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        email.click();
        email.sendKeys("iteaqa@gmail.com");
//
//        WebElement next = webDrivers.findElement(By.xpath("//*[contains(text(),'Далі')]"));
//        next.click();
//
//        webDrivers.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        WebElement password = webDrivers.findElement(By.name("password"));
//        password.click();
//        password.sendKeys("itea1234");
//
//        WebElement next2 = webDrivers.findElement(By.xpath("//*[contains(text(),'Далі')]"));
//        next2.click();

    }
}
