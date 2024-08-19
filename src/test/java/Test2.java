import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Test2 {
    public static PaymentBlock paymentBlock;
    public static WebDriver driver;

    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        paymentBlock = new PaymentBlock(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("page"));
        paymentBlock.inputPhoneNumber(ConfProperties.getProperty("phone"));
        paymentBlock.inputSum(ConfProperties.getProperty("sum"));
        paymentBlock.clickPaymentBtn();
    }

    @Test
    public void checkingCvcContentFild() {
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        String actualCvcContentFild = paymentBlock.getFildCvcContent();
        Assertions.assertEquals(ConfProperties.getProperty("cvcCode"), actualCvcContentFild);
        driver.switchTo().defaultContent();
    }

    @Test
    public void checkingNumberCardFild() {
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        String actualNumberCardFild = paymentBlock.getFildCardContent();
        Assertions.assertEquals(ConfProperties.getProperty("cardNumber"), actualNumberCardFild);
        driver.switchTo().defaultContent();

    }

    @Test
    public void checkingValidityPeriodFild() {
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        String actualValidityPeriodFild = paymentBlock.getFildValidityPeriodContent();
        Assertions.assertEquals(ConfProperties.getProperty("periodOfValidity"), actualValidityPeriodFild);
        driver.switchTo().defaultContent();
    }

    @Test
    public void checkingHoldersNameFild() {
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        String actualHoldersNameFild = paymentBlock.getFildHoldersNameContent();
        Assertions.assertEquals(ConfProperties.getProperty("nameOfHolder"), actualHoldersNameFild);
        driver.switchTo().defaultContent();
    }

    @Test
    public void checkingSumUp() {
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        String actualSumUpContent = paymentBlock.getSumUpContent();
        actualSumUpContent.contains("sum");
        driver.switchTo().defaultContent();
    }

    @Test
    public void checkingSumDown() {
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        String actualSumDownContent = paymentBlock.getSumDownContent();
        actualSumDownContent.contains("sum");
        driver.switchTo().defaultContent();
    }

    @Test
    public void checkingNumberPhoneMarked() {
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        String actualNumberPhoneMarkedContent = paymentBlock.getNumberPhoneMarkedContent();
        actualNumberPhoneMarkedContent.contains("phone");
        driver.switchTo().defaultContent();
    }

    @Test
    public void checkingIcons() {
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        List<WebElement> actualIconsContent = paymentBlock.getIconsContent();
        Assertions.assertTrue(!actualIconsContent.isEmpty());
        driver.switchTo().defaultContent();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

}


