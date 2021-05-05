package starter.search;

import org.openqa.selenium.By;

class SearchResultRepo {
    static By RESULT_TITLES = By.cssSelector("#links .result__title a:nth-child(1)");
    static By EDIT_RESULTS_BUTTON = By.xpath("//*[@class='make_flex alnItemCenter']");
    static By FLIGHT_SEARCH_TITLE = By.xpath("//*[@class='font22 text-black append_bottom20 cards-heading']");
    static By HOTEL_SEARCH_LISTING = By.id("_Hlisting_area");
}
