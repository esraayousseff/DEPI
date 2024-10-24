package base;

import Page.LoginPage;
import Page.MakeAppointmentsPage;
import Page.appConfirmation;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppConfirmationTests extends BaseTests {
     appConfirmation appConfirmationPage = new appConfirmation(driver);
    MakeAppointmentsPage makeAppointmentsPage = new MakeAppointmentsPage(driver);

    @BeforeClass
    public void login() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.login("John Doe", "ThisIsNotAPassword");
        appConfirmationPage = new appConfirmation(driver);
        makeAppointmentsPage = new MakeAppointmentsPage(driver);}

        @Test
         public void MakeingAppointment() {
        makeAppointmentsPage.selectFromDropDown("Seoul CURA Healthcare Center");
        makeAppointmentsPage.selectCheckBox();
        makeAppointmentsPage.selectRadioBtn();
        makeAppointmentsPage.selectDate("12/12/2022");
        makeAppointmentsPage.inputComment("this is a comment");
        makeAppointmentsPage.clickMakeApp();}


         @Test
        public void SummaryOfAppointmenttitletest() {
         MakeingAppointment ();
        Assert.assertTrue(driver.getPageSource().contains("Appointment Confirmation"));
        Assert.assertTrue(driver.getPageSource().contains("Please be informed that your appointment has been booked as following:"));}

         @Test
         public void SummaryOfAppointmentvaluestest() {
        MakeingAppointment ();
        Assert.assertTrue(driver.findElement(appConfirmationPage.HealthcareProgramm).getText().contains("Medicaid"));
        Assert.assertTrue(driver.findElement(appConfirmationPage.applycheckBox).getText().contains("Yes"));
        Assert.assertTrue(driver.findElement(appConfirmationPage.vistDatee).getText().contains("12/12/2022"));
        Assert.assertTrue(driver.findElement(appConfirmationPage.comments).getText().contains("this is a comment"));
        Assert.assertTrue(driver.findElement(appConfirmationPage.faciltyvalue).getText().contains("Seoul CURA Healthcare Center"));
    }



}