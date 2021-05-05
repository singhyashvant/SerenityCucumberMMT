package starter.search;

import org.openqa.selenium.By;

public class SearchForHotelRepo {
    static By HOTELS_TAB = By.xpath("//*[@class='chNavIcon appendBottom2 chSprite chHotels']");
    static By CITY_FIELD = By.id("city");
    static By CITY_FIELD_TEXT = By.xpath("//*[@placeholder='Enter city/ Hotel/ Area/ Building']");
    static By CITY_FIELD_FIRST_SUGGESTION = By.xpath("//*[@role='option'][1]");
    static By CHECK_IN_DATE = By.xpath("//*[@aria-label='Sat May 29 2021']");
    static By CHECK_OUT_DATE = By.xpath("//*[@aria-label='Mon May 31 2021']");
    static By SEARCH_HOTEL_BUTTON = By.xpath("//*[@data-cy='submit']");
    static By InvalidCityErrorMessage = By.className("cantFindYouText appendBottom20 noSuggesstions");


}
