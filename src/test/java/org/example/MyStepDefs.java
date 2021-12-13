package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    HomePage homepage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage = new RegistrationSuccessPage();

    ComputersPage computersPage = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ProductEmailAFriendPage productEmailAFriendPage = new ProductEmailAFriendPage();

    NewReleasePage newReleasePage = new NewReleasePage();

    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        homepage.clickOnRegisterLink();
    }
    @When("user enters required registration details")
    public void user_enters_required_registration_details() {
        registrationPage.fillUserDetails();
    }
    @When("click on register submit button")
    public void click_on_register_submit_button() {
        registrationPage.clickOnRegisterButton();
    }
    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        registrationSuccessPage.verifyUserIsOnRegisterSuccessPage();
        registrationSuccessPage.verifyUserHasSuccessfullyRegistered();
    }

    @Given("user clicks on computers main menu")
    public void user_clicks_on_computers_main_menu() {
        homepage.clickOnComputersMenu();
    }
    @Given("user clicks on desktop heading")
    public void user_clicks_on_desktop_heading() {
        computersPage.clickOnDesktopsHeading();
    }
    @Then("user should see desktop page")
    public void user_should_see_desktop_page() {
        desktopPage.checkUserIsInTheDesktopPage();
    }

    @Then("user clicks on Build your own computer heading")
    public void user_clicks_on_build_your_own_computer_heading() {
        desktopPage.clickOnAProduct();
    }
    @Then("user should see Build your own computer page")
    public void user_should_see_build_your_own_computer_page() {
        buildYourOwnComputerPage.checkUserIsOnThisPage();
    }
    @Then("user clicks on Email a friend button")
    public void user_clicks_on_email_a_friend_button() {
        buildYourOwnComputerPage.clickOnEmailAFriendButton();
    }

    @Then("user should see email a friend page")
    public void user_should_see_email_a_friend_page() {
        productEmailAFriendPage.checkUserIsOnTheProductEmailAFriendPage();
    }
    @When("user fills the form")
    public void user_fills_the_form() {
        productEmailAFriendPage.fillEmailAFriendForm();

    }

    @When("clicks on send email button")
    public void clicks_on_send_email_button() {
        productEmailAFriendPage.clickOnSendEmailButton();
    }
    @Then("user should see the email has been successfully sent message")
    public void user_should_see_the_email_has_been_successfully_sent_message() {
        productEmailAFriendPage.checkEmailIsSentSuccessfully();
    }
    @When("user click on details button")
    public void user_click_on_details_button() {
        homepage.clickOnDetailsButton();
        }
    @When("user fills comments form")
    public void user_fills_comments_form() {
        newReleasePage.checkUserIsInTheNewReleasePage();
        newReleasePage.fillCommentSection();
        }
    @When("clicks on new comment button")
    public void clicks_on_new_comment_button() {

        newReleasePage.clickOnNewCommentButton();
        }
    @Then("the user should see the comment has been posted successfully")
    public void the_user_should_see_the_comment_has_been_posted_successfully() {
        newReleasePage.checkTheCommentIsPostedSuccessfully();
    }


}
