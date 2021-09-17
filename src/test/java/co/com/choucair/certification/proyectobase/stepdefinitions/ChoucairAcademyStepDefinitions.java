//##DAJ
package co.com.choucair.certification.proyectobase.stepdefinitions;
import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.task.Login;
import co.com.choucair.certification.proyectobase.task.OpenUp;

import co.com.choucair.certification.proyectobase.task.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        //Solo debemos utilizar wasAbleToen el Given, para el When y el Then, usamos AttempsTo.
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),
                Login.onThePage(academyChoucairData.get(0).getStrUser(),
                        academyChoucairData.get(0).getStrPassword()));
    }

    @When("^he search for the course on the choucair academy plataform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlataform(List<AcademyChoucairData> academyChoucairData) {

        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));

    }

    //En el Then, se implementan las Questions.
    @Then("^he finds the course called resources$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));

    }
}
