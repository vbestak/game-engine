package hr.bestak.game.state;

import hr.bestak.engine.Engine;
import hr.bestak.engine.KeyHandler;
import hr.bestak.engine.state.BaseState;
import hr.bestak.game.entity.Player;
import hr.bestak.game.entity.base.movement.LinearMovement;

import java.awt.Graphics2D;

public class Game extends BaseState {
  private Player player;
  private KeyHandler keyHandler;

  public Game() {
    this.keyHandler = Engine.getKeyHandler();
    this.player = new Player(keyHandler,  new LinearMovement());
  }

  @Override
  public void update() {
    this.player.update();
  }

  @Override
  public void render(Graphics2D graphics) {
    this.player.render(graphics);
  }
  
}
