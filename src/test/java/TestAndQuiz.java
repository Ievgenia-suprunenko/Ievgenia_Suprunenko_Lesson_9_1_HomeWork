import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestAndQuiz {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/evgenia/Downloads/chromedriver");

        WebDriver webDrivers = new ChromeDriver();
        webDrivers.get("https://www.testandquiz.com/selenium/testing.html");
        WebElement link = webDrivers.findElement(By.linkText("This is a link"));
        link.click();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.testandquiz.com/selenium/testing.html");
        WebElement textInput = webDriver.findElement(By.id("fname"));
        textInput.click();
        textInput.sendKeys("Hello");

        WebElement clickButton = webDriver.findElement(By.id("idOfButton"));
        clickButton.click();

        WebElement radioButton = webDriver.findElement(By.id("female"));
        radioButton.click();

        WebElement checkbox = webDriver.findElement(By.className("Automation"));
        checkbox.click();

        Select dropdown = new Select(webDriver.findElement(By.id("testingDropdown")));
        dropdown.selectByVisibleText("Automation Testing");
        dropdown.selectByIndex(3);

        Actions actions = new Actions(webDriver);
        WebElement doubleClick = webDriver.findElement(By.id("dblClkBtn"));
        actions.doubleClick(doubleClick).perform();
        Alert alert = webDriver.switchTo().alert();
        alert.accept();

        WebElement alertBox = webDriver.findElement(By.xpath("//*[contains(text(),'Generate Alert Box')]"));
        alertBox.click();
        Alert al = webDriver.switchTo().alert();
        al.accept();

        WebElement confirmBox = webDriver.findElement(By.xpath("//*[contains(text(),'Generate Confirm Box')]"));
        confirmBox.click();
        Alert alerts = webDriver.switchTo().alert();
        alerts.dismiss();
        confirmBox.getAttribute("You pressed Cancel!");

//        WebElement dragAndDropFrom = webDriver.findElement(By.id("sourceImage"));
//        WebElement dragAndDropTo = webDriver.findElement(By.id("targetDiv"));
//        Actions actions = new Actions(webDriver);
//        actions.dragAndDrop(dragAndDropFrom, dragAndDropTo).build().perform();
    }
}
