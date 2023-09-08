package gameMod;

import java.util.Random;

public class NormalGame extends GameMod {
    @Override
    public void info() {
        super.info();
        System.out.println("На этом уровне сложности" +
                " загаданное слово состит из 5-х букв латиницы." +
                "Вам нужно их угадать за 15 попыток");
    }


    public static NormalGame initNormal() {
        NormalGame normal = new NormalGame(0, 0, 12, NormalGame.makeWord());
        return normal;
    }


    public NormalGame(int cow, int bull, int attempt, String word) {
        super(cow, bull, attempt, word);
    }

    public static String makeWord() {
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 5;
        int randomLimitedInt = 0;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        System.out.println(generatedString);
        return generatedString;
    }


}
