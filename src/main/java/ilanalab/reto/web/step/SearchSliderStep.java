package ilanalab.reto.web.step;

import ilanalab.reto.web.pageobject.RepositorioWidgets;
import ilanalab.reto.web.utils.PersonalFunctions;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.core.Serenity.getDriver;

public class SearchSliderStep {
    private RepositorioWidgets repositorioWidgets;
    PersonalFunctions personalFunctions;

    @Step
    public void slider(){
        repositorioWidgets.widgets_menu.click();
        scrollToElement();
        repositorioWidgets.slider_btn.click();
    }
    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }


}
