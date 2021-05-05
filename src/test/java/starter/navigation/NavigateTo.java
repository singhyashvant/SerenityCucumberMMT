package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    MmtHomePage mmtHomePage;

    @Step("Open the make my trip home page")
    public void theMmtHomePage() {
        mmtHomePage.open();
    }
}
