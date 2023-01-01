package com.amicable.automation1.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class StepDefinition {
    WebDriver driver;

    @Given("User is logged in and on Contact us page")
    public void user_is_logged_in_and_on_contact_us_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://amaninja.co.uk/pages/contact");

    }
    @Then("Details should be filled in contact us form")
    public void details_should_be_filled_in_contact_us_form(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {


        WebElement nameWE;
        WebElement emailWE;
        WebElement phoneNumberWE;
        WebElement commentWE;
        nameWE = driver.findElement(By.id("ContactForm-name"));
        emailWE = driver.findElement(By.id("ContactForm-email"));
        phoneNumberWE = driver.findElement(By.id("ContactForm-phone"));
        commentWE = driver.findElement(By.id("ContactForm-body"));
        List<Map<String, String>> contactUsInformation = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> i : contactUsInformation) {
            if(!contactUsInformation.isEmpty()) {
                String name = i.get("name");
                nameWE.sendKeys(name);
                String email = i.get("email");
                emailWE.sendKeys(email);
                String phoneNumber = i.get("phoneNumber");
                phoneNumberWE.sendKeys(phoneNumber);
                String comment = i.get("comment");
                commentWE.sendKeys(comment);
                Thread.sleep(3000);
                nameWE.clear();
                emailWE.clear();
                phoneNumberWE.clear();
                commentWE.clear();
            }else{
                System.out.println("Empty Datatable");
            }


        }

    }

}
