package com.example.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class AddPetStepDefinitions {
    @Given("I have a Web Interface")
    public void I_have_a_web_interface(){
        System.out.println("Web Interface available");
    }
    @When("I click on Add New Pet Link")
    public void I_click_add_new_pet() {
        System.out.println("clicking add new pet");
    }
    @Then("I should get Add New Pet Page")
        public void I_should_get_add_new_pet_page(){
            System.out.println("Getting add new pet pate");
        }
    }

