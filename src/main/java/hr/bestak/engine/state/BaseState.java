package hr.bestak.engine.state;

import javax.swing.JPanel;
import java.awt.Graphics2D;

public abstract class BaseState extends JPanel {

  public abstract void update();

  public abstract void render(Graphics2D g);
  
}
