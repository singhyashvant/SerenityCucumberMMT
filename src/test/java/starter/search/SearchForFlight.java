package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchForFlight extends UIInteractionSteps {

    @Step("Search for flight {0}")
    public void searchForFlight(String source,String destination) throws InterruptedException {
        $(SearchForFlightRepo.OUTSIDE_MODAL).click();
        $(SearchForFlightRepo.CLOSE_DOWNLOAD_APP_BANNER).click();
        $(SearchForFlightRepo.SOURCE_FIELD).shouldBeVisible();
        $(SearchForFlightRepo.SOURCE_FIELD).click();
        $(SearchForFlightRepo.SOURCE_FIELD_TEXT).type(source);
        Thread.sleep(2000);
        $(SearchForFlightRepo.SOURCE_FIELD_FIRST_SUGGESTION).click();
        $(SearchForFlightRepo.DESTINATION_FIELD_TEXT).type(destination);
        Thread.sleep(2000);
        $(SearchForFlightRepo.SOURCE_FIELD_FIRST_SUGGESTION).click();
        $(SearchForFlightRepo.DEPARTURE_DATE).click();
        $(SearchForFlightRepo.SEARCH_BUTTON).click();

    }
    @Step("Search for invalid flight source {0}")
    public void searchForInvalidFlightSource(String source) throws InterruptedException {
        $(SearchForFlightRepo.OUTSIDE_MODAL).click();
        $(SearchForFlightRepo.CLOSE_DOWNLOAD_APP_BANNER).click();
        $(SearchForFlightRepo.SOURCE_FIELD).shouldBeVisible();
        $(SearchForFlightRepo.SOURCE_FIELD).click();
        $(SearchForFlightRepo.SOURCE_FIELD_TEXT).type(source);
        Thread.sleep(2000);
    }
    @Step("verify error message for invalid flight source")
    public void verifyErrorMsgForInvalidSource(){
//        Assert.assertTrue($(SearchForFlightRepo.INVALID_SOURCE_ERROR_MESSAGE).isPresent());
        Assert.assertEquals("No Data Found",$(SearchForFlightRepo.INVALID_SOURCE_ERROR_MESSAGE).getText());
    }
}
