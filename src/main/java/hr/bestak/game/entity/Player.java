package hr.bestak.game.entity;

import hr.bestak.engine.KeyHandler;
import hr.bestak.game.entity.base.MoveableEntity;
import hr.bestak.game.entity.base.movement.Movement;

import java.awt.*;

public class Player extends MoveableEntity {
    private KeyHandler keyHandler;
    private Movement movement;

    public Player(KeyHandler keyHandler, Movement movement) {
        this.keyHandler = keyHandler;
        this.movement = movement;
    }

    @Override
    public void update() {
        move();
    }

    @Override
    public void render(Graphics2D graphics) {
        graphics.setColor(Color.CYAN);
        graphics.fillRect(x, y, 50, 50);
    }

    @Override
    public void move() {
        this.movement.move(this, keyHandler);
    }

}
