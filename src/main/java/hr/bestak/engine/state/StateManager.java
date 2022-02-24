package hr.bestak.engine.state;

import hr.bestak.engine.Screen;

import java.awt.Color;
import java.awt.Graphics2D;

public class StateManager {
  private BaseState currentState;

  public void loop() {
    if(this.currentState == null) return;

    this.currentState.update();

    Graphics2D g = getStateGraphics();
    if(g != null){
      g.setColor(Color.black);

      // TODO fix
      g.fillRect(0, 0, 300, 300);
      
      this.currentState.render(g);
      g.dispose();
    }

    System.out.println("[Game State]: looping!");
  }

  private Graphics2D getStateGraphics() {
    return (Graphics2D) this.currentState.getGraphics();
  }

  public BaseState getCurrentState() {
    return currentState;
  }

  public void setCurrentState(BaseState currentState) {
    this.currentState = currentState;
    Screen.setPanel(currentState);
  }

}
