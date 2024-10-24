package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HistoryPage {

    public WebDriver driver;
    public HistoryPage(WebDriver driver){this.driver = driver;}

    public By HistoryTitle = By.xpath("//h2[contains(text(),'History')]");
    public By datehistory = By.xpath("//*[@class=\"panel-heading\"]");
    public By faciltyvalue = By.id("facility");
    public By applycheckBox = By.id("hospital_readmission");
    public By HealthcareProgramm = By.id("program");
    public By vistDatee = By.id("visit_date");
    public By comments = By.id("comment");
    public By GohomeBtn = By.xpath("//a[contains(text(),'Go to Homepage')]");


    public HomePage clickGohome() {
        driver.findElement(GohomeBtn).click();
        return new HomePage(driver);}



}
