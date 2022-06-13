import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton {
    WebDriver driver;

    public RadioButton(WebDriver driver) {
        this.driver = driver;
    }

    private final String url = "https://demo.seleniumeasy.com/basic-radiobutton-demo.html";
    private final By maleButton = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input");
    private final By femaleButton = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input");
    private final By getCheckedValueButton = By.xpath("//*[@id=\"buttoncheck\"]");
    private final By textResult = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]");

    public void navigate() {
        driver.get(url);
    }

    public void clickMaleButton() {
        driver.findElement(maleButton).click();
    }
    public void clickFemaleButton() {
        driver.findElement(femaleButton).click();
    }
    public void clickGetCheckedValueButton() {
        driver.findElement(getCheckedValueButton).click();
    }
    public String getResult() {
        return driver.findElement(textResult).getText();
    }
}
