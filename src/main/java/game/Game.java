package game;

import gameMod.LvlGame;
import gameMod.Mod;

public class Game {
    private Mod modGame;



  public void info(){
      System.out.println("Введиет уровень сложности:");
      System.out.println("EASY");
      System.out.println("NORMAL");
      System.out.println("HARD");
  }

    public static void create(String s) {
               GameFactory.started(LvlGame.valueOf(s));
    }






}
