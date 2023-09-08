package game;


import gameMod.*;

public class GameFactory {


    public static GameMod started(LvlGame lvl) {
        GameMod mod = null;

        switch (lvl) {
            case EASY:
                mod = EasyGame.initEasy();
                System.out.println("Создана Игра уровень сложности: Легко");
                break;
            case NORMAL:
                mod = NormalGame.initNormal();
                System.out.println("Создана Игра уровень сложности: Нормально");
                break;
            case HARD:
                mod = HardGame.initHard();
                System.out.println("Создана Игра уровень сложности: Сложно");
                break;
            default:
                System.out.println("Не верная команда");
        }
        return mod;
    }




}
