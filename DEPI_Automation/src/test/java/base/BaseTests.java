package base;

import Page.HomePage;
import Page.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.WindowManager;
import java.time.Duration;

public class BaseTests {
    WebDriver driver ;
    protected HomePage homePage;


    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        goHome();}


    @BeforeMethod
    public void goHome(){
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); }


    @AfterClass
    public void tearDown() {driver.quit();}


    public WindowManager getWindowManager(){return new WindowManager(driver); }


}
