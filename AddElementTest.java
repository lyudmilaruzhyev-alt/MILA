import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddElementTest {

    @Test
    public void addDeleteElementTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addButton.click();

        WebElement deleteButton = driver.findElement(By.className("added-manually"));

        // Проверки
        Assert.assertTrue(deleteButton.isDisplayed());

        deleteButton.click();

        driver.quit();
    }
}
