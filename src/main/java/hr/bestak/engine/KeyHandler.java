package hr.bestak.engine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

public class KeyHandler implements KeyListener {
    private Map<Integer, Boolean> pressed;

    public KeyHandler() {
        this.pressed = new HashMap<>();
    }

    public boolean isPressed(Integer code) {
        if(pressed.containsKey(code)){
            return pressed.get(code);
        }

        return false;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        pressed.put(code, true);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        pressed.put(code, false);
    }
}
