package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    WebDriver driver;

    @Given("user opens chrome browser")
    public void user_opens_chrome_browser() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("user opens Google homepage")
    public void user_opens_google_homepage() {

        driver.get("https://www.google.com");
    }

    @And("user searches for {string}")
    public void user_searches_for(String searchText) {

        driver.findElement(By.name("q"))
                .sendKeys(searchText + Keys.ENTER);
    }

    @Then("search results should appear")
    public void search_results_should_appear() throws InterruptedException {

        Thread.sleep(3000);

        String title = driver.getTitle();

        System.out.println("Page Title is: " + title);

        Assert.assertTrue(title.contains("Selenium"));

//        driver.quit();
    }
}