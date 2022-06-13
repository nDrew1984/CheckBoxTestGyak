import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {
    WebDriver driver;

    public CheckBox(WebDriver driver) {
        this.driver = driver;
    }

    private final String url = "https://demo.seleniumeasy.com/basic-checkbox-demo.html";
    private final By checkBox = By.xpath("//*[@id=\"isAgeSelected\"]");
    private final By text = By.xpath("//*[@id=\"txtAge\"]");

    public void navigate() {
        driver.get(url);
    }

    public void clickCheckBox() {
        WebElement e = driver.findElement(checkBox);
        e.click();
    }
    public String textResult() {
        WebElement e = driver.findElement(text);
        return e.getText();
    }


}
