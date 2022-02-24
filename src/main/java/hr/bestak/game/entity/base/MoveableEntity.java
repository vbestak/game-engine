package hr.bestak.game.entity.base;

public abstract class MoveableEntity extends Entity {
    private int speed = 1;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void move();
}
