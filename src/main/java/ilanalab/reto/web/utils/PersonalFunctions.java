package ilanalab.reto.web.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class PersonalFunctions extends PageObject {
    public void scrollToElement(String xpath) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", $(xpath));
    }

    public void modificarValueElemento(String xpathElemento, String nuevoValor) {
        WebElementFacade elemento = $(By.xpath(xpathElemento));
        elemento.type(nuevoValor);
    }
}
