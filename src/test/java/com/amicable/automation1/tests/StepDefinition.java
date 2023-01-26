package com.amicable.automation1.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class StepDefinition {
    WebDriver driver;

    @Given("User is logged in and on home Screen")
    public void user_is_logged_in_and_on_home_screen() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://amaninja.co.uk/");

    }
    @Then("User should be able able to see {int} Product items")
    public void user_should_be_able_able_to_see_product_items(Integer int1) {

    }
    @Then("product items should have an following components")
    public void product_items_should_have_an_following_components(io.cucumber.datatable.DataTable dataTable) {

        WebElement imageWE;
        WebElement descriptionWE;
        WebElement priceWE;
        WebElement startbarWE;
        WebElement chooseOptionButtonWE;
        imageWE = driver.findElement(By.xpath("//*[@id=\"Slide-template--17083250704692__featured_collection-4\"]/div/div/div[1]/div[1]/div/img[1]"));
        descriptionWE =  driver.findElement(By.xpath("//*[@id=\"CardLink-template--17083250704692__featured_collection-8067090841908\"]"));
        priceWE =  driver.findElement(By.xpath("//*[@id=\"Slide-template--17083250704692__featured_collection-4\"]/div/div/div[2]/div[1]/div"));
        startbarWE =  driver.findElement(By.xpath("//*[@id=\"Slide-template--17083250704692__featured_collection-4\"]/div/div/div[1]/div[2]/div[2]"));
        chooseOptionButtonWE =  driver.findElement(By.xpath("//*[@id=\"Slide-template--17083250704692__featured_collection-4\"]/div/div/div[2]/div[2]"));

        Assert.assertTrue(imageWE.isDisplayed());
        Assert.assertTrue(descriptionWE.isDisplayed());
        Assert.assertTrue(priceWE.isDisplayed());
        Assert.assertTrue(startbarWE.isDisplayed());
        Assert.assertTrue(chooseOptionButtonWE.isDisplayed());




    }
    }
