import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver;

    @Given("User open secondhand web {string}")
    public void userOpenSecondhandWeb(String link) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(link);
    }
    @When("User click button Login in Dashboard Page")
    public void user_click_button_login_in_dashboard_page() {
        driver.findElement(By.xpath("//div[@id=\"navbarText\"]/ul/li/a")).click();
    }

    @When("User redirect to Login Page")
    public void user_redirect_to_login_page() {
        driver.findElement(By.xpath("//button[@type=\"submit \"]")).isDisplayed();
    }

    @When("User input value of email with {string}")
    public void user_input_value_of_email_with(String email) {
        driver.findElement(By.id("exampleInputEmail1")).sendKeys(email);
    }

    @When("User input value of password with {string}")
    public void user_input_value_of_password_with(String password) {
       driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(password);
    }

    @When("User click button of Masuk on Login page")
    public void user_click_button_of_masuk_on_login_page() {
        driver.findElement(By.xpath("//button[@type=\"submit \"]")).click();
    }
}
