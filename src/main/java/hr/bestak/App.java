package hr.bestak;

import hr.bestak.engine.Engine;
import hr.bestak.game.state.Game;
import hr.bestak.game.state.MainMenu;

public class App {
    public static void main( String[] args ) {
        Engine.init(new Game());
    }
}
