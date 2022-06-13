import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class CheckBoxTest {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-extensions");
        options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void CheckBoxTest() {
        CheckBox checkBox = new CheckBox(driver);
        checkBox.navigate();
        checkBox.clickCheckBox();

        String actual = checkBox.textResult();
        String expected = "Success - Check box is checked";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioButtonTest() {
        RadioButton radioButton = new RadioButton(driver);
        radioButton.navigate();
        radioButton.clickMaleButton();
        radioButton.clickGetCheckedValueButton();

        String actualMale = radioButton.getResult();
        String expectedMale = "Radio button 'Male' is checked";

        Assertions.assertEquals(expectedMale, actualMale);

        radioButton.clickFemaleButton();
        radioButton.clickGetCheckedValueButton();

        String actualFemale = radioButton.getResult();
        String expectedFemale = "Radio button 'Female' is checked";

        Assertions.assertEquals(expectedFemale, actualFemale);

    }
}
