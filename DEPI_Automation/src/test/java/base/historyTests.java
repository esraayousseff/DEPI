package base;

import Page.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class historyTests extends BaseTests {

    @BeforeClass
    public void login() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.login("John Doe", "ThisIsNotAPassword");
        MakeAppointmentsPage makeAppointmentsPage = new MakeAppointmentsPage(driver);}

    public void MakeingAppointment(WebDriver driver) {
        MakeAppointmentsPage makeAppointmentsPage = new MakeAppointmentsPage(driver);
        makeAppointmentsPage.selectFromDropDown("Seoul CURA Healthcare Center");
        makeAppointmentsPage.selectCheckBox();
        makeAppointmentsPage.selectRadioBtn();
        makeAppointmentsPage.selectDate("12/12/2022");
        makeAppointmentsPage.inputComment("this is a comment");
        makeAppointmentsPage.clickMakeApp();}


    @Test
    public void SummaryOfAppointmentvaluestest() {
        HistoryPage historypage = new HistoryPage(driver);
        MakeingAppointment (driver);
        homePage.ClickHistoryFromSideMenu();
        Assert.assertTrue(driver.findElement(historypage.HistoryTitle).getText().contains("History"));
        Assert.assertTrue(driver.findElement(historypage.faciltyvalue).getText().contains("Seoul CURA Healthcare Center"));
        Assert.assertTrue(driver.findElement(historypage.applycheckBox).getText().contains("Yes"));
        Assert.assertTrue(driver.findElement(historypage.HealthcareProgramm).getText().contains("Medicaid"));
        Assert.assertTrue(driver.findElement(historypage.datehistory).getText().contains("12/12/2022"));
        Assert.assertTrue(driver.findElement(historypage.comments).getText().contains("this is a comment"));
    }



}