package game;

import gameMod.GameMod;
import gameMod.LvlGame;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

public class Game {
    private static GameMod modGame;


    public static void info() {
        System.out.println("Введиет уровень сложности:");
        System.out.println("EASY");
        System.out.println("NORMAL");
        System.out.println("HARD");
    }


    public static LvlGame findEnum(String s) {
        for (LvlGame e : LvlGame.values()) {
            if (e.name().equals(s)) {
                return e;
            }

        }
        System.out.println("Нет такой команды");
        return null;
    }

    private static GameMod create() {
        String s;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            s = scanner.next();
            if (findEnum(s) != null) {
                modGame = GameFactory.started(findEnum(s));
                return modGame;
            }

        }

    }

    public static void games() {
        info();
        modGame = create();
        modGame.info();
        String answer;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < modGame.getAttempt(); i++) {
            answer = s.next();
            if (!modGame.result(answer)){
                System.out.println("Осталось "+ (modGame.getAttempt() - i) + " попыток");
            }else {
                i = modGame.getAttempt();
                System.out.println("Поздравляем!");
            }
        }
        System.out.println("Игра завершина!");

    }


}
