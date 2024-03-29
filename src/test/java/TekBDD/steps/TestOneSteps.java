package TekBDD.steps;

import TekBDD.untilities.Utilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestOneSteps extends Utilities {
    @When("verfiy page title as {string}")
    public void verfiy_page_title_as_tek_school(String string) {
      String PageTitle = getDriver().getTitle;
    }
    @Then("Click on Sign in Link")
    public void click_on_sign_in_link() {

    }
    @Then("Enter email address {string}")
    public void enter_email_address(String string) {

    }
    @Then("Enter password {string}")
    public void enter_password(String string) {

    }
    @Then("Validate the error meessage os displayed as {string}")
    public void validate_the_error_meessage_os_displayed_as(String string) {
    }
}
