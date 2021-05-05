package starter.search;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResult extends UIInteractionSteps {
    public List<String> titles() {
        return findAll(SearchResultRepo.RESULT_TITLES)
                .stream()
                .map(WebElementFacade::getTextContent)
                .filter(text -> !text.equalsIgnoreCase("Ad"))
                .collect(Collectors.toList());
    }
    @Step
    public void assertFlightSearchTitle()
    {
        $(SearchResultRepo.FLIGHT_SEARCH_TITLE).waitUntilVisible();
        Assert.assertTrue($(SearchResultRepo.FLIGHT_SEARCH_TITLE).isPresent());
    }
    @Step
    public void verifyHotelSearchResults()
    {
        $(SearchResultRepo.HOTEL_SEARCH_LISTING).waitUntilVisible();
        Assert.assertTrue($(SearchResultRepo.HOTEL_SEARCH_LISTING).isPresent());

    }
}
