package hr.bestak.game.entity.base;

import java.awt.*;

public abstract class Entity {
    protected Integer x = 0;
    protected Integer y = 0;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public abstract void update();

    public abstract void render(Graphics2D graphics);
}
