package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utils.CommonMethods;
import utils.Constants;
import utils.configReader;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class EmployeeSearchSteps extends CommonMethods{
    @Given("user is navigated to the HRMS application")
    public void user_is_navigated_to_the_hrms_application() {
        openBrowserAndLaunchApplication();
    }
    @When("user enters valid admin credentials")
    public void user_enters_valid_admin_credentials() {
        //LoginPage login = new LoginPage();
        //WebElement username = driver.findElement(By.id("txtUsername"));
        sendText(login.usernameBox, configReader.getPropertyValue("username"));
        //WebElement password = driver.findElement(By.name("txtPassword"));
        sendText(login.passwordBox,  configReader.getPropertyValue("password"));
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, SECONDS);

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        //LoginPage login = new LoginPage();
        //WebElement loginButton = driver.findElement(By.id("btnLogin"));
        click(login.loginBtn);

    }
    @When("user is navigated to employee list page")
    public void user_is_navigated_to_employee_list_page() {

        //WebElement pimOption =driver.findElement(By.id("menu_pim_viewPimModule"));
        //pimOption.click();
        click(employeeSearchPage.pimOption);

        //WebElement empListOption = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        //empListOption.click();
        click(employeeSearchPage.empListOption);

    }
    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        //WebElement searchID = driver.findElement(By.id("empsearch_id"));
        //searchID.sendKeys("8510142");
        sendText(employeeSearchPage.idField,  "8510142");
    }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        //WebElement searchButton = driver.findElement(By.id("searchBtn"));
        //searchButton.click();
        click(employeeSearchPage.searchButton);
    }
    @Then("user is able to see employee information")
    public void user_is_able_to_see_employee_information() {
        System.out.println("Result displayed!");
        tearDown();
    }

    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {
        //WebElement empName = driver.findElement(By.xpath("(//*[@type='text'])[1]"));
        //empName.sendKeys("Zubair");
        sendText(employeeSearchPage.nameField, "Zubair");
    }
}
