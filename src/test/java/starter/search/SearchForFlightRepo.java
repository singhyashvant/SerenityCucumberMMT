package starter.search;

import org.openqa.selenium.By;

class SearchForFlightRepo {
    static By OUTSIDE_MODAL = By.xpath("//*[contains(@class,'loginModal displayBlock modalLogin dynHeight personal ')]");
    static By SOURCE_FIELD = By.id("fromCity");
    static By SOURCE_FIELD_TEXT = By.xpath("//*[@placeholder='From']");
    static By SOURCE_FIELD_FIRST_SUGGESTION = By.xpath("//*[@role='option'][1]");
    static By DESTINATION_FIELD = By.id("toCity");
    static By DESTINATION_FIELD_TEXT = By.xpath("//*[@placeholder='To']");
    static By DEPARTURE_DATE = By.xpath("//*[@aria-label='Mon May 31 2021']");
    static By SEARCH_BUTTON = By.xpath("//*[@data-cy='submit']/a");
    static By CLOSE_DOWNLOAD_APP_BANNER = By.xpath("//span[@class='ic_circularclose_grey']");
    static By INVALID_SOURCE_ERROR_MESSAGE = By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']/div/div[1]/p[1]");
}
