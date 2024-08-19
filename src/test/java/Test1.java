import io.qameta.allure.Epic;
import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static PaymentBlock paymentBlock;
    public static WebDriver driver;

    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        paymentBlock = new PaymentBlock(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("page"));
    }

    @Epic("Услуги связи")
    @Description("Поле номер телефона")
    @Test
    public void checkingPlaceHolderPhoneTest() {
        String actualPlaceholderPhone = paymentBlock.checkPlaceholderPhone();
        Assertions.assertEquals(ConfProperties.getProperty("phonePlaceholder"), actualPlaceholderPhone);
    }

    @Description("Поле сумма")
    @Test
    public void checkingPlaceHolderSumTest() {
        String actualPlaceholderSum = paymentBlock.checkPlaceholderSum();
        Assertions.assertEquals(ConfProperties.getProperty("sumPlaceholder"), actualPlaceholderSum);
    }

    @Description("Поле e-mail")
    @Test
    public void checkingPlaceHolderEmailTest() {
        String actualPlaceholderEmail = paymentBlock.checkPlaceholderEmail();
        Assertions.assertEquals(ConfProperties.getProperty("emailPlaceholder"), actualPlaceholderEmail);
    }

    @Epic("Домашний интернет")
    @Description("Поле номер абонента")
    @Test
    public void checkingPlaceHolderNumberNumber() {
        String actualPlaceholderNumberSubscriber = paymentBlock.checkPlaceholderNumberSubscriber();
        Assertions.assertEquals(ConfProperties.getProperty("subscriberNumberPlaceholder"), actualPlaceholderNumberSubscriber);
    }

    @Description("Поле сумма")
    @Test
    public void checkingPlaceHolderSumHomeInternet() {
        String actualPlaceholderSumHomeInternet = paymentBlock.checkPlaceholderSumHomeInternet();
        Assertions.assertEquals(ConfProperties.getProperty("sumPlaceholder"), actualPlaceholderSumHomeInternet);
    }

    @Description("Поле e-mail")
    @Test
    public void checkingPlaceHolderEmailHomeInternet() {
        String actualPlaceholderEmailHomeInternet = paymentBlock.checkPlaceholderEmailHomeInternet();
        Assertions.assertEquals(ConfProperties.getProperty("emailPlaceholder"), actualPlaceholderEmailHomeInternet);
    }


    @Epic("Рассрочка")
    @Description("Поле номер аккаунта")
    @Test
    public void checkingPlaceHolderAccountNumber() {
        String actualPlaceholderAccountNumber = paymentBlock.checkPlaceholderNumberAccount();
        Assertions.assertEquals(ConfProperties.getProperty("accountNumberPlaceholder"), actualPlaceholderAccountNumber);
    }

    @Description("Поле сумма")
    @Test
    public void checkingPlaceHolderSumInstalment() {
        String actualPlaceholderSumInstalment = paymentBlock.checkPlaceholderSumInstalment();
        Assertions.assertEquals(ConfProperties.getProperty("sumPlaceholder"), actualPlaceholderSumInstalment);
    }

    @Description("Поле e-mail")
    @Test
    public void checkingPlaceHolderEmailInstalment() {
        String actualPlaceholderEmailInstalment = paymentBlock.checkPlaceholderEmailInstalment();
        Assertions.assertEquals(ConfProperties.getProperty("emailPlaceholder"), actualPlaceholderEmailInstalment);
    }

    @Epic("Задолженность")
    @Description("Поле номер аккаунта")
    @Test
    public void checkingPlaceHolderNumberAccountArrears() {
        String actualPlaceHolderNumberAccountArrears = paymentBlock.checkPlaceholderNumberAccountArrears();
        Assertions.assertEquals(ConfProperties.getProperty("accountNumberArrearsPlaceholder"), actualPlaceHolderNumberAccountArrears);
    }

    @Description("Поле сумма")
    @Test
    public void checkingPlaceHolderSumArrears() {
        String actualPlaceholderSumArrears = paymentBlock.checkPlaceholderSumArrears();
        Assertions.assertEquals(ConfProperties.getProperty("sumPlaceholder"), actualPlaceholderSumArrears);
    }

    @Description("Поле e-mail")
    @Test
    public void checkingPlaceHolderEmailArrears() {
        String actualPlaceholderEmailArrears = paymentBlock.checkPlaceholderEmailArrears();
        Assertions.assertEquals(ConfProperties.getProperty("emailPlaceholder"), actualPlaceholderEmailArrears);
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

}
