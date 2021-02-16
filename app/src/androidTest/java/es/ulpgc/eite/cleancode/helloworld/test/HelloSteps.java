package es.ulpgc.eite.cleancode.helloworld.test;

import android.app.Activity;
import android.content.Intent;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import es.ulpgc.eite.cleancode.helloworld.R;
import es.ulpgc.eite.cleancode.helloworld.hello.HelloActivity;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@SuppressWarnings("ALL")
public class HelloSteps {


  @Rule
  public ActivityTestRule<HelloActivity> testRule =
      new ActivityTestRule(HelloActivity.class, true, false);

  private Activity activity;


  @Before("@hello-feature")
  public void setUp() {
    testRule.launchActivity(new Intent());
    activity = testRule.getActivity();
  }

  @After("@hello-feature")
  public void tearDown() {
    testRule.finishActivity();
  }

  @Given("^iniciar pantalla Hello$")
  public void iniciarPantallaHello() {

  }

  @And("^ocultar mensaje en pantalla Hello$")
  public void ocultarMensajeEnPantallaHello() {

    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {

    }

    //onView(withId(R.id.helloMessage)).check(matches(not(isDisplayed())));
    onView(withId(R.id.helloMessage)).check(matches(isDisplayed()));
    onView(withId(R.id.helloMessage))
        .check(matches(withText(activity.getString(R.string.empty_text))));
  }


  @When("^pulsar boton SayHello$")
  public void pulsarBotonSayHello() {

    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {

    }

    onView(withId(R.id.sayHelloButton)).check(matches(isDisplayed()));
    onView(withId(R.id.sayHelloButton)).perform(click());
  }

  @Then("^mostrar mensaje HelloWorld en pantalla Hello$")
  public void mostrarMensajeHelloWorldEnPantallaHello() {

    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {

    }

    onView(withId(R.id.helloMessage)).check(matches(isDisplayed()));
    onView(withId(R.id.helloMessage))
        .check(matches(withText(activity.getString(R.string.hello_message))));
  }

  @When("^pulsar boton GoBye$")
  public void pulsarBotonGoBye() {
    onView(withId(R.id.goByeButton)).check(matches(isDisplayed()));
    onView(withId(R.id.goByeButton)).perform(click());
  }

  @Then("^iniciar pantalla Bye$")
  public void iniciarPantallaBye() {

  }

  @And("^ocultar mensaje en pantalla Bye$")
  public void ocultarMensajeEnPantallaBye() {
    //onView(withId(R.id.byeMessage)).check(matches(not(isDisplayed())));
    onView(withId(R.id.byeMessage)).check(matches(isDisplayed()));
    onView(withId(R.id.byeMessage))
        .check(matches(withText(activity.getString(R.string.empty_text))));
  }


  @And("^mostrar mensaje HelloWorld en pantalla Bye$")
  public void mostrarMensajeHelloWorldEnPantallaBye() {
    onView(withId(R.id.byeMessage)).check(matches(isDisplayed()));
    onView(withId(R.id.byeMessage))
        .check(matches(withText(activity.getString(R.string.hello_message))));
  }


  @Then("^finalizar pantalla Bye$")
  public void finalizarPantallaBye() {
  }

  @And("^resumir pantalla Hello$")
  public void resumirPantallaHello() {

  }

  @When("^pulsar boton SayBye$")
  public void pulsarBotonSayBye() {
    onView(withId(R.id.sayByeButton)).check(matches(isDisplayed()));
    onView(withId(R.id.sayByeButton)).perform(click());
  }

  @Then("^mostrar mensaje ByeWorld en pantalla Bye$")
  public void mostrarMensajeByeWorldEnPantallaBye() {
    onView(withId(R.id.byeMessage)).check(matches(isDisplayed()));
    onView(withId(R.id.byeMessage))
        .check(matches(withText(activity.getString(R.string.bye_message))));
  }

  @When("^pulsar boton GoHello$")
  public void pulsarBotonGoHello() {
    onView(withId(R.id.goHelloButton)).check(matches(isDisplayed()));
    onView(withId(R.id.goHelloButton)).perform(click());
  }

  @And("^mostrar mensaje ByeWorld en pantalla Hello$")
  public void mostrarMensajeByeWorldEnPantallaHello() {

    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {

    }

    onView(withId(R.id.helloMessage)).check(matches(isDisplayed()));
    onView(withId(R.id.helloMessage))
        .check(matches(withText(activity.getString(R.string.bye_message))));
  }

  @When("^pulsar boton Back$")
  public void pulsarBotonBack() {
    pressBack();
  }

}