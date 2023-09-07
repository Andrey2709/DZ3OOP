package game;


import gameMod.*;

public class GameFactory {


    public static Mod started(LvlGame lvl) {
        Mod mod = null;
        System.out.println("Введите уровень сложности:");
        System.out.println("EASY");
        System.out.println("NORMAL");
        System.out.println("HARD");

        switch (lvl) {
            case EASY:
                mod = EasyGame.initEasy();
                System.out.println("Создана Игра уровень сложности: Легко");
                break;
            case NORMAL:
                mod = new NormalGame();
                System.out.println("Создана Игра уровень сложности: Нормально");
                break;
            case HARD:
                mod = new HardGame();
                System.out.println("Создана Игра уровень сложности: Сложно");
            default:
                System.out.println("Не верная команда");
        }
        return mod;
    }




}
