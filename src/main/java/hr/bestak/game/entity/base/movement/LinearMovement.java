package hr.bestak.game.entity.base.movement;

import hr.bestak.engine.KeyHandler;
import hr.bestak.game.constants.Settings;
import hr.bestak.game.entity.base.MoveableEntity;

public class LinearMovement implements Movement{
    @Override
    public void move(MoveableEntity entity, KeyHandler keyHandler) {
        if(keyHandler.isPressed(Settings.PLAYER_UP)){
            int y = entity.getY() - entity.getSpeed();
            entity.setY(y);
        }

        if(keyHandler.isPressed(Settings.PLAYER_DOWN)){
            int y = entity.getY() + entity.getSpeed();
            entity.setY(y);
        }

        if(keyHandler.isPressed(Settings.PLAYER_RIGHT)){
            int x = entity.getX() + entity.getSpeed();
            entity.setX(x);
        }

        if(keyHandler.isPressed(Settings.PLAYER_LEFT)){
            int x = entity.getX() - entity.getSpeed();
            entity.setX(x);
        }
    }
}
