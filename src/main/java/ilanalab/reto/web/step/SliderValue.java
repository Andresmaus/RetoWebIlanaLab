package ilanalab.reto.web.step;

import ilanalab.reto.web.pageobject.RepositorioWidgets;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class SliderValue {
    private RepositorioWidgets repositorioWidgets;

    public void value(String valor){

        String valorBuscado = repositorioWidgets.boxValue.getValue();
        assertThat(valorBuscado, containsString(valor));
    }
}
