//##DAJ
package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC;

    static {
        BUTTON_UC = Target.the("Selecciona la universidad choucair")
                .located(By.xpath("//div[@id= 'universidad']//strong"));
    }

    public static final Target INPUT_COURSE;

    static {
        INPUT_COURSE = Target.the("Buscar el curso")
                .located(By.id("coursesearchbox"));
    }

    public static final Target BUTTON_GO;

    static {
        BUTTON_GO = Target.the("Da click para buscar el curso")
                .located(By.id("//button[@class = 'btn btn-secondary']"));
    }

    public static final Target SELECT_COURSE;

    static {
        SELECT_COURSE = Target.the("Da click para seleccionar el curso")
                .located(By.xpath("//h4[contains(text(), 'Recursos Automatización Bancolombia')]"));
    }

    public static final Target NAME_COURSE;

    static {
        NAME_COURSE = Target.the("Extrae el nombre del curso")
                .located(By.xpath("//h1[contains(text(), 'Recursos Automatización Bancolombia')]"));
    }

}
