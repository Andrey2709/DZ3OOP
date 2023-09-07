package gameMod;

public class EasyGame extends GameMod implements Mod {

    private int cow;
    private int bull;
    private int attempt;
    private String word;

    public int getAttempt() {
        return attempt;
    }

    public int getCow() {
        return cow;
    }

    public int getBull() {
        return bull;
    }

    public static EasyGame initEasy() {
        EasyGame easy = new EasyGame(0, 0, 15, EasyGame.makeWord());
        return easy;
    }

    public EasyGame(int cow, int bull, int attempt, String word) {
        this.cow = cow;
        this.bull = bull;
        this.attempt = attempt;
        this.word = word;
    }



    private static String makeWord() {
        StringBuilder bild = new StringBuilder();
        int x;
        for (int i = 0; i < 4; i++) {
            x = (int) (Math.random() * 6);
            bild.append(x);

        }

        return String.valueOf(bild);
    }

    /**
     * Метод проверки. Проверяет совпадение сгенерированого и введенного пользователем слова.
     *
     * @param answer
     * @return
     */
    @Override
    public boolean result(String answer) {
        return false;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("На этом уровне сложности" +
                "Загаданное слово состит из 4-х цифр." +
                "Вам нужно их угадать за 15 попыток");
    }
}
