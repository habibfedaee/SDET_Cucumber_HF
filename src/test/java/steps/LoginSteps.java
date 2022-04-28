package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utils.CommonMethods;
import utils.Constants;
import utils.configReader;

import static java.util.concurrent.TimeUnit.SECONDS;

public class LoginSteps extends CommonMethods {
    // first scenario
    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        System.out.println("test passed, logged in successfully");
        tearDown();
    }

    //second scenario
    @When("user enters valid ess username and password")
    public void user_enters_valid_ess_username_and_password() {
        //LoginPage login = new LoginPage();
        //WebElement username = driver.findElement(By.id("txtUsername"));
        sendText(login.usernameBox,  "tts12345");
        //WebElement password = driver.findElement(By.name("txtPassword"));
        sendText(login.passwordBox,  "Hum@nhrm123");

    }
    @Then("ess user is successfully logged in")
    public void ess_user_is_successfully_logged_in() {
        System.out.println("ess user logged in!");
        tearDown();
    }

    // third scenario
    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        //LoginPage login = new LoginPage();
        //WebElement username = driver.findElement(By.id("txtUsername"));
        sendText(login.usernameBox, "tts12345");
        //WebElement password = driver.findElement(By.name("txtPassword"));
        sendText(login.passwordBox,  "Hum");

    }
    @Then("user sees error message on the screen")
    public void user_sees_error_message_on_the_screen() {
        // HW to verify the error message
        System.out.println("invalid username or password!");
    }


}
