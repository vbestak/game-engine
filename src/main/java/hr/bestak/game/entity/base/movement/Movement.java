package hr.bestak.game.entity.base.movement;

import hr.bestak.engine.KeyHandler;
import hr.bestak.game.entity.base.MoveableEntity;

public interface Movement {
    void move(MoveableEntity entity, KeyHandler keyHandler);
}
