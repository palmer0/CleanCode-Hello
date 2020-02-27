package es.ulpgc.eite.cleancode.helloworld.hello;

import es.ulpgc.eite.cleancode.helloworld.app.AppMediator;
import es.ulpgc.eite.cleancode.helloworld.app.ByeToHelloState;
import es.ulpgc.eite.cleancode.helloworld.app.HelloToByeState;



public class HelloRouter implements HelloContract.Router {

  public static String TAG = HelloRouter.class.getSimpleName();

  private AppMediator mediator;

  public HelloRouter(AppMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public ByeToHelloState getDataFromByeScreen() {
    if (mediator != null) {
      return mediator.getByeToHelloState();
    }

    return null;
  }

  @Override
  public void passDataToByeScreen(HelloToByeState state) {
    // no implemented
  }

  @Override
  public void navigateToByeScreen() {
    // no implemented
  }

}
