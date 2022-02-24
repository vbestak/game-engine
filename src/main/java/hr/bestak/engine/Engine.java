package hr.bestak.engine;

import hr.bestak.engine.state.BaseState;
import hr.bestak.engine.state.StateManager;


public class Engine implements Runnable {
  private static StateManager stateManager;
  private static Thread gameThread;
  private static KeyHandler keyHandler;

  private Engine() {}

  public static void init(BaseState state) {
    System.out.println("[Game Engine]: inititation!");

    Screen.init(getKeyHandler());
    initStateManager(state);
    initGameThread();
  }

  private static void initStateManager(BaseState state) {
    stateManager = new StateManager();
    setGameState(state);
  }

  private static void initGameThread() {
    gameThread = new Thread(new Engine());
    gameThread.start();
  }

  private static void initKeyHandler() {
    keyHandler = new KeyHandler();
  }

  public void run() {
    System.out.println("[Game Engine]: run!");

    // nano / max fps
    double drawInterval = 1_000_000_000/60;
    double delta = 0;
    long lastTime = System.nanoTime();
    long currentTime;

    while(gameThread != null){
      currentTime = System.nanoTime();
      delta += (currentTime - lastTime) / drawInterval;
      lastTime = currentTime;
      
      if(delta >= 1) {
        try{
          stateManager.loop();
          delta--;
        }catch(Exception e){
          System.out.println("[Engine]: " + e.getMessage());
        }
      }
    }
  }

  public static KeyHandler getKeyHandler() {
    if(keyHandler == null){
      initKeyHandler();
    }

    return keyHandler;
  }

  public static BaseState getGameState() {
    return stateManager.getCurrentState();
  }

  public static void setGameState(BaseState state) {
    stateManager.setCurrentState(state);
  }
}
