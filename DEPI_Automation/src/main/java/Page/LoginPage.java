package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {this.driver = driver;}

    private By usernameField = By.id("txt-username");
    private By passwordField = By.id("txt-password");
    private By loginButton = By.id("btn-login");


    public MakeAppointmentsPage login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new MakeAppointmentsPage(driver); }

        public void login2 (String username, String password) {
            driver.findElement(usernameField).sendKeys(username);
            driver.findElement(passwordField).sendKeys(password);
            driver.findElement(loginButton).click();}

    }
