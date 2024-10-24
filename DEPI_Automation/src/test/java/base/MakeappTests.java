package base;

import Page.LoginPage;
import Page.MakeAppointmentsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class MakeappTests extends BaseTests{
    MakeAppointmentsPage makeAppointmentsPage = new MakeAppointmentsPage(driver);

    @BeforeClass
    public void login() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.login("John Doe", "ThisIsNotAPassword");
        makeAppointmentsPage = new MakeAppointmentsPage(driver);
    }

    @Test
    public void CheckdropdownFacilty(){
        makeAppointmentsPage.selectFromDropDown("Seoul CURA Healthcare Center");
        assert makeAppointmentsPage.getTextFromDropDown().contains("Seoul CURA Healthcare Center");}

    @Test
    public void checkbox(){
        makeAppointmentsPage.selectCheckBox();
        Assert.assertTrue(makeAppointmentsPage.isCheckBoxSelected());}


    @Test
    public void radioBtn()  {
        makeAppointmentsPage.selectRadioBtn();
        Assert.assertTrue(driver.findElement(makeAppointmentsPage.HealthcareProgram).isSelected());}

    @Test
    public void date(){
        makeAppointmentsPage.selectDate("12/12/2022");
        Assert.assertTrue(driver.findElement(makeAppointmentsPage.vistDate).getAttribute("value").contains("12/12/2022"));}

    @Test
    public void comment() {
        makeAppointmentsPage.inputComment("this is a comment");
        Assert.assertTrue(driver.findElement(makeAppointmentsPage.comment).getAttribute("value").contains("this is a comment"));
    }



    @Test
    public void MakeingAppointment() {
        makeAppointmentsPage.selectFromDropDown("Seoul CURA Healthcare Center");
        makeAppointmentsPage.selectCheckBox();
        makeAppointmentsPage.selectRadioBtn();
        makeAppointmentsPage.selectDate("12/12/2022");
        makeAppointmentsPage.inputComment("this is a comment");
        makeAppointmentsPage.clickMakeApp();
        Assert.assertTrue(driver.getPageSource().contains("Appointment Confirmation"));
        Assert.assertTrue(driver.getPageSource().contains("Please be informed that your appointment has been booked as following:"));


    }

    }