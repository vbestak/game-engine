package hr.bestak.engine;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyListener;

public class Screen {
  private static JFrame window;

  public static void init(KeyListener keyListener){
      System.out.println("[Screen]: initializing!");
      
      window = new JFrame("Welcome to the game!");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setSize(300,300);
      window.addKeyListener(keyListener);
      window.setVisible(true);
  }

  public static void setPanel(JPanel container){
    if(window == null) {
      System.out.println("[Screen]: failed to set panel! no window available!");
      return;
    }

    container.setDoubleBuffered(true);
    window.setContentPane(container);
  }
}
