package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By makeappbtn =By.id("btn-make-appointment");
    private By Sidemenu = By.id("menu-toggle");
    private By History = By.xpath("//a[contains(text(),'History')]");
    private By profile = By.xpath("//a[contains(text(),'Profile')]");
    private By logout = By.xpath("//a[contains(text(),'Logout')]");



    public LoginPage clickFormAuthentication(){
        driver.findElement(makeappbtn).click();
        return new LoginPage(driver);}

    public HistoryPage ClickHistoryFromSideMenu(){
        driver.findElement(Sidemenu).click();
        driver.findElement(History).click();
        return new HistoryPage(driver);}


}