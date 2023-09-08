package gameMod;

public class EasyGame extends GameMod  {



    public static EasyGame initEasy() {
        EasyGame easy = new EasyGame(0, 0, 15, EasyGame.makeWord());
        return easy;
    }

    public EasyGame(int cow, int bull, int attempt, String word) {
       super(cow,bull,attempt,word);
    }



    private static String makeWord() {
        StringBuilder bild = new StringBuilder();
        int x;
        for (int i = 0; i < 4; i++) {
            x = (int) (Math.random() * 6);
            bild.append(x);

        }
        System.out.println(bild);
        return String.valueOf(bild);
    }



    @Override
    public void info() {
        super.info();
        System.out.println("На этом уровне сложности" +
                " загаданное слово состит из 4-х цифр." +
                "Вам нужно их угадать за 15 попыток");
    }



}
