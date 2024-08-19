import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PaymentBlock {

    public WebDriver driver;

    public PaymentBlock(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'connection-phone')]")
    private WebElement phoneField;

    @FindBy(xpath = "//*[@id=\"pay-connection\"]/button")
    private WebElement paymentBtn;

    @FindBy(xpath = "//*[contains(@id, 'connection-sum')]")
    private WebElement sumField;

    @FindBy(xpath = "//*[@id=\"connection-email\"]")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[2]/svg/use")
    private WebElement openListBtn;

    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p")
    private WebElement chooseSecondForm;

    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p")
    private WebElement chooseThirdForm;

    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p")
    private WebElement chooseFourthForm;

    @FindBy(xpath = "//*[@id=\"internet-phone\"]")
    private WebElement numberSubscriberField;

    @FindBy(xpath = "//*[@id=\"internet-sum\"]")
    private WebElement sumHomeInternetField;

    @FindBy(xpath = "//*[@id=\"internet-email\"]")
    private WebElement emailHomeInternetField;

    @FindBy(xpath = "//*[@id=\"score-instalment\"]")
    private WebElement accountNumberField;

    @FindBy(xpath = "//*[@id=\"instalment-sum\"]")
    private WebElement sumInstalmentField;

    @FindBy(xpath = "//*[@id=\"instalment-email\"]")
    private WebElement emailInstalmentField;

    @FindBy(xpath = "//*[@id=\"score-arrears\"]")
    private WebElement accountNumberArrearsField;

    @FindBy(xpath = "//*[@id=\"instalment-sum\"]")
    private WebElement sumArrearsField;

    @FindBy(xpath = "//*[@id=\"arrears-email\"]")
    private WebElement emailArrearsField;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label")
    private WebElement numberCard;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label")
    private WebElement validityPeriod;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]/label")
    private WebElement cvc;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]/label")
    private WebElement holdersName;

    @FindBy(xpath = "//*[@id=\"cookie-agree\"]")
    private WebElement cooky;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]")
    private WebElement sumUp;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button")
    private WebElement sumDown;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span")
    private WebElement numberPhoneMarked;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div")
    private List<WebElement> icons;

    public String getFildCardContent() {
        String fildCardContent = numberCard.getText();
        return fildCardContent;
    }

    public String getFildValidityPeriodContent() {
        String fildValidityPeriodContent = validityPeriod.getText();
        return fildValidityPeriodContent;
    }

    public String getFildCvcContent() {
        String fildCvcContent = cvc.getText();
        return fildCvcContent;
    }

    public String getFildHoldersNameContent() {
        String fildHoldersNameContent = holdersName.getText();
        return fildHoldersNameContent;
    }

    public String getSumUpContent() {
        String sumUpContent = sumUp.getText();
        return sumUpContent;
    }

    public String getSumDownContent() {
        String sumDownContent = sumDown.getText();
        return sumDownContent;
    }

    public String getNumberPhoneMarkedContent() {
        String PhoneMarkedContentContent = numberPhoneMarked.getText();
        return PhoneMarkedContentContent;
    }

    public List<WebElement> getIconsContent() {
        List<WebElement> iconsContent = icons;
        return iconsContent;
    }

    public void inputPhoneNumber(String phone) {
        phoneField.sendKeys(phone);
    }

    public void inputSum(String sum) {
        sumField.sendKeys(sum);
    }

    public void clickPaymentBtn() {
        paymentBtn.click();
    }

    public String checkPlaceholderPhone() {
        String placeholderPhone = phoneField.getAttribute("placeholder");
        return placeholderPhone;
    }

    public String checkPlaceholderSum() {
        String placeholderSum = sumField.getAttribute("placeholder");
        return placeholderSum;
    }

    public String checkPlaceholderEmail() {
        String placeholderEmail = emailField.getAttribute("placeholder");
        return placeholderEmail;
    }

    public String checkPlaceholderNumberSubscriber() {
        String placeholderNumberSubscriber = numberSubscriberField.getAttribute("placeholder");
        return placeholderNumberSubscriber;
    }

    public String checkPlaceholderSumHomeInternet() {
        String placeholderSumHomeInternet = sumHomeInternetField.getAttribute("placeholder");
        return placeholderSumHomeInternet;
    }

    public String checkPlaceholderEmailHomeInternet() {
        String placeholderEmailHomeInternet = emailHomeInternetField.getAttribute("placeholder");
        return placeholderEmailHomeInternet;
    }

    public String checkPlaceholderNumberAccount() {
        String placeholderNumberAccount = accountNumberField.getAttribute("placeholder");
        return placeholderNumberAccount;
    }

    public String checkPlaceholderSumInstalment() {
        String placeholderSumHomeInstalment = sumInstalmentField.getAttribute("placeholder");
        return placeholderSumHomeInstalment;
    }

    public String checkPlaceholderEmailInstalment() {
        String placeholderEmailInstalment = emailInstalmentField.getAttribute("placeholder");
        return placeholderEmailInstalment;
    }

    public String checkPlaceholderNumberAccountArrears() {
        String placeholderNumberAccountArrears = accountNumberArrearsField.getAttribute("placeholder");
        return placeholderNumberAccountArrears;
    }

    public String checkPlaceholderSumArrears() {
        String placeholderSumArrears = sumArrearsField.getAttribute("placeholder");
        return placeholderSumArrears;
    }

    public String checkPlaceholderEmailArrears() {
        String placeholderEmailArrears = emailArrearsField.getAttribute("placeholder");
        return placeholderEmailArrears;
    }
}
