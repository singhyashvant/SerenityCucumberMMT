package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchForHotel extends UIInteractionSteps {
    @Step("Search for hotel {0}")
    public void searchForHotel(String destination) throws InterruptedException {
        $(SearchForFlightRepo.OUTSIDE_MODAL).click();
        $(SearchForFlightRepo.CLOSE_DOWNLOAD_APP_BANNER).click();
        $(SearchForHotelRepo.HOTELS_TAB).waitUntilClickable();
        $(SearchForHotelRepo.HOTELS_TAB).click();
        $(SearchForHotelRepo.CITY_FIELD).shouldBeVisible();
        $(SearchForHotelRepo.CITY_FIELD).click();
        $(SearchForHotelRepo.CITY_FIELD_TEXT).type(destination);
        Thread.sleep(2000);
        $(SearchForHotelRepo.CITY_FIELD_FIRST_SUGGESTION).click();
        $(SearchForHotelRepo.CHECK_IN_DATE).click();
        $(SearchForHotelRepo.CHECK_OUT_DATE).click();
        $(SearchForHotelRepo.SEARCH_HOTEL_BUTTON).click();
    }
    @Step("Search for special character in hotel {0}")
    public void searchForInvalidHotel(String destination) throws InterruptedException {
        $(SearchForFlightRepo.OUTSIDE_MODAL).click();
        $(SearchForFlightRepo.CLOSE_DOWNLOAD_APP_BANNER).click();
        $(SearchForHotelRepo.HOTELS_TAB).waitUntilClickable();
        $(SearchForHotelRepo.HOTELS_TAB).click();
        $(SearchForHotelRepo.CITY_FIELD).shouldBeVisible();
        $(SearchForHotelRepo.CITY_FIELD).click();
        $(SearchForHotelRepo.CITY_FIELD_TEXT).type(destination);
        Thread.sleep(2000);
    }
    @Step("verify error message for invalid hotel city")
    public void verifyErrorMsgForInvalidCity(){
        Assert.assertTrue($(SearchForHotelRepo.InvalidCityErrorMessage).isPresent());
//        Assert.assertEquals("No Data Found",$(SearchForFlightRepo.INVALID_SOURCE_ERROR_MESSAGE).getText());
    }
}
