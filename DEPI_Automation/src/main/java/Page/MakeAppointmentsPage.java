package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MakeAppointmentsPage {

    private WebDriver driver;

    public MakeAppointmentsPage(WebDriver driver) {
        this.driver = driver;
    }

    public By facilty = By.id("combo_facility");
    public By checkBox = By.id("chk_hospotal_readmission");
    public By HealthcareProgram = By.id("radio_program_medicaid");
    public By vistDate = By.id("txt_visit_date");
    public By comment = By.id("txt_comment");
    public By makeappBtn = By.id("btn-book-appointment");


    public void  selectFromDropDown(String option) {
        Select dropdownElement = new Select(driver.findElement(facilty));
        dropdownElement.selectByVisibleText(option);}

    public String getTextFromDropDown() {
        Select dropdownElement = new Select(driver.findElement(facilty));
        return dropdownElement.getFirstSelectedOption().getText(); }


    public void selectCheckBox( ) {
        driver.findElement(checkBox).click();}

    public boolean isCheckBoxSelected() {
        return driver.findElement(checkBox).isSelected();
    }

    public void selectRadioBtn() {
        driver.findElement(HealthcareProgram).click();}

    public void selectDate(String date) {
        driver.findElement(vistDate).sendKeys(date);}

    public void inputComment(String commentText) {
        driver.findElement(comment).sendKeys(commentText);}


    public void clickMakeApp() {
        driver.findElement(makeappBtn).click();}


    public appConfirmation SummaryOfAppointment () {
        return new appConfirmation(driver);}


}
