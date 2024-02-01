package ilanalab.reto.web.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RepositorioWidgets extends PageObject {

    @FindBy(xpath = "//h5[contains(text(),'Widgets')]")
    public WebElementFacade widgets_menu;

    @FindBy(xpath = "//span[contains(text(),'Slider')]")
    public WebElementFacade slider_btn;
    @FindBy(xpath = "//span[contains(text(),'Menu')]")
    public WebElementFacade menu_btn;

    @FindBy(xpath = "//input[@class='range-slider range-slider--primary']")
    public WebElementFacade slider_input;

    @FindBy(id = "sliderValue")
    public WebElementFacade boxValue;
}
