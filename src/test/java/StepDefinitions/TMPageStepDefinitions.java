package StepDefinitions;

import Pages.Homepage;
import Pages.LoginPage;
import Pages.TimeAndMaterialPage;
import Utilities.Commondriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import static org.junit.Assert.assertEquals;
//import dev.failsafe.internal.util.Assert;
import org.junit.Assert;
//import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotSame;
//import org.openqa.selenium.WebDriver;

public class TMPageStepDefinitions extends Commondriver
{

           LoginPage loginPageObj = new LoginPage();
           Homepage homePageObj = new Homepage();
           TimeAndMaterialPage TMPageObj = new TimeAndMaterialPage();

    @Given("I logged into TurnUp portal successfully") //I logged into TurnUp portal successfully
    public void i_logged_into_turn_up_portal_successfully() {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        loginPageObj.LoginActions(driver);
    }

    @Given("I navigate to Time and Materials page")
    public void i_navigate_to_time_and_materials_page() {
        // Write code here that turns the phrase above into concrete actions
        homePageObj.GoToTimeAndMaterialPage(driver);
    }

    @When("I create a new Time record")
    public void i_create_a_new_time_record() {
        // Write code here that turns the phrase above into concrete actions
        TMPageObj.CreateTimeRecord(driver);
    }

    @Then("the record should be created successfully") //the record should be created successfully
    public void the_record_should_be_created_successfully() {
        // Write code here that turns the phrase above into concrete actions
        String Code = TMPageObj.GetCode(driver);
        String Actual = "345";
       // Assert.assertEquals(Code,Actual);
        //Assert.assertEquals(Code,Actual,"New record not Created");
        Assert.assertEquals("Record Not Created",Code,Actual);

        driver.quit();
    }

    @When("I update {string} on existing Time record")
    public void i_update_on_existing_time_record(String description) {
        // Write code here that turns the phrase above into concrete actions
        TMPageObj.EditTimeRecord(driver,description);
    }

    @Then("the record should have an updated {string}")
    public void the_record_should_have_an_updated(String description) {
        // Write code here that turns the phrase above into concrete actions
        String Desc = TMPageObj.GetEditedDesc(driver);
        //Assert.assertEquals(Desc,description,"Record not Updated");
        assertEquals("Record Not Edited",Desc,description);

        driver.quit();
    }

    @When("I delete an existing Time record")
    public void i_delete_an_existing_time_record() {
        // Write code here that turns the phrase above into concrete actions
        TMPageObj.DeleteTimeRecord(driver);

    }

    @Then("the record should be deleted successfully")
    public void the_record_should_be_deleted_successfully() {
        // Write code here that turns the phrase above into concrete actions
        String Code = TMPageObj.GetCodeValue(driver);
        String Actual = "345";
        //Assert.assertNotEquals(Code, "123", "New Record not Deleted Successfully");
        assertNotSame("Record not Deleted",Actual,Code);
        driver.quit();
    }

}
