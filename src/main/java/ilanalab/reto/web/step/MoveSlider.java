package ilanalab.reto.web.step;

import ilanalab.reto.web.pageobject.RepositorioWidgets;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import static ilanalab.reto.web.utils.Constants.NUMBER_INITIAL;
import static ilanalab.reto.web.utils.Constants.NUMBER_LIMIT;


public class MoveSlider {
    private RepositorioWidgets repositorioWidgets;

    public void move() {
        repositorioWidgets.slider_input.click();

        for (int i = NUMBER_INITIAL; i <= NUMBER_LIMIT; i++) {

            repositorioWidgets.slider_input.sendKeys(Keys.LEFT);


        }

    }


}
