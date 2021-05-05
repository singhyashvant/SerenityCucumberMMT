package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.navigation.NavigateTo;
import starter.search.SearchForFlight;
import starter.search.SearchForHotel;
import starter.search.SearchResult;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchMmtStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    SearchForFlight searchForFlight;

    @Steps
    SearchResult searchResult;

    @Steps
    SearchForHotel searchForHotel;


    @Given("user is on homepage")
    public void userIsOnHomepage() {
        navigateTo.theMmtHomePage();
    }

    @When("user provides the {string} and {string} in the search criteria")
    public void userProvidesTheAnd(String source, String destination) throws InterruptedException {
        searchForFlight.searchForFlight(source,destination);
    }

    @Then("user should be able to see the search results")
    public void userShouldBeAbleToSeeTheSearchResults() {
        searchResult.assertFlightSearchTitle();
    }

    @When("user provides the {string} special characters in the source")
    public void userProvidesTheSpecialCharactersInTheSource(String source) throws InterruptedException {
        searchForFlight.searchForInvalidFlightSource(source);
    }

    @Then("user should be able to see the error message for invalid flight source")
    public void userShouldBeAbleToSeeTheErrorMessageForInvalidFlightSource() {
        searchForFlight.verifyErrorMsgForInvalidSource();
    }

    @When("user selects the hotels with {string} as destination")
    public void userSelectsTheHotelsWithAsDestination(String destination) throws InterruptedException {
        searchForHotel.searchForHotel(destination);
    }

    @Then("user should be able to see the hotel search results")
    public void userShouldBeAbleToSeeTheHotelSearchResults() {
        searchResult.verifyHotelSearchResults();
    }

    @When("user provides the {string} special characters in the hotel search")
    public void userProvidesTheSpecialCharactersInTheHotelSearch(String city) throws InterruptedException {
        searchForHotel.searchForInvalidHotel(city);
    }

    @Then("user should be able to see the error message for invalid hotel search")
    public void userShouldBeAbleToSeeTheErrorMessageForInvalidHotelSearch() {
    }
}
