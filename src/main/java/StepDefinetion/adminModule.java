package StepDefinetion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adminModule {

    @Given("The user want to navigate admin module")
    public void the_user_want_to_navigate_admin_module() {
        System.out.println(" selam ");

    }
    @Given("The user want to enter amazon on google")
    public void the_user_want_to_enter_amazon_on_google() {
        System.out.println("cetin");

    }
    @When("The user want to click login button")
    public void the_user_want_to_click_login_button() {
        System.out.println("eman");

    }
    @Then("The user want to verify title")
    public void the_user_want_to_verify_title() {
        System.out.println("meghraoui");

    }
}
