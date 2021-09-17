//##DAJ
package co.com.choucair.certification.proyectobase.task;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUp implements Task {

    private ChoucairAcademyPage choucairAcademyPage;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

       //En este metodo es donde ejecuaremos todas las acciones de nuestras prueba
        // los clics, los ingresos, las selecciones, en ete metodo es donde toda la magia ocurrirá.

        actor.attemptsTo(Open.browserOn(choucairAcademyPage));

    }

}

