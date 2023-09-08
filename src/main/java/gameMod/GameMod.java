package gameMod;

public abstract class GameMod {

    private int cow;
    private int bull;
    private int attempt;
    private String word;

    public GameMod(int cow, int bull, int attempt, String word) {
        this.cow = cow;
        this.bull = bull;
        this.attempt = attempt;
        this.word = word;
    }


    public int getCow() {
        return cow;
    }

    public int getBull() {
        return bull;
    }

    public int getAttempt() {
        return attempt;
    }

    private static int findCow(char[] charsWord, char[] charsAnswer) {
        int cowCount = 0;
        char[] charsA = charsAnswer.clone();
        char[] charsW = charsWord.clone();
        for (int i = 0; i < charsA.length; i++) {
            for (int j = 0; j < charsW.length; j++) {
                if (charsW[j] == charsA[i]) {
                    charsW[j] = 0;
                    cowCount++;
                    j = charsW.length;
                }
            }
        }
        return cowCount;
    }

    private static int findBull(char[] charsWord, char[] charsAnswer) {
        int bullCount = 0;
        for (int i = 0; i < charsWord.length; i++) {
            if (charsWord[i] == charsAnswer[i]) {
                bullCount++;
            }
        }
        return bullCount;
    }


    public boolean result(String answer) {


        if (answer.length() > this.word.length()) {
            System.out.println("Слово должно быть тойже длинны что и загаданное");
            return false;
        }


        char[] charsWord = this.word.toCharArray();
        char[] charsAnswer = answer.toCharArray();


        this.cow = findCow(charsWord, charsAnswer);
        this.bull = findBull(charsWord, charsAnswer);

        if (this.bull == charsWord.length) {
            System.out.println("Быков: " + this.bull + " Коров: " + this.cow);
            System.out.println("Вы выйграли!");
            return true;
        }
        System.out.println("Быков: " + this.bull + " Коров: " + this.cow);
        return false;
    }


    public void info() {
        System.out.println("Привет добрый друг");
        System.out.println("Приветствую тебя в игре \"Быки Коровы\"");
        System.out.println("Быки Коровы — логическая игра, в ходе которой за несколько попыток один из игроков должен определить, что задумал другой игрок." +
                "Длинна загаданной строки и ее содержание зависит от выбранного уровня сложности.");

    }
}
