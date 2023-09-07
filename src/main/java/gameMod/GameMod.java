package gameMod;

public abstract class GameMod implements Mod{





    @Override
    public boolean result(String answer) {
        return false;
    }

    @Override
    public void info() {
        System.out.println("Привет добрый друг");
        System.out.print("Приветствую тебя в игре \"Быки Коровы\"");
        System.out.println("Быки и коровы — логическая игра, в ходе которой за несколько попыток один из игроков должен определить, что задумал другой игрок." +
                "Длинна загаданной стрроки и ее содержание зависит от выбранного уровня сложности.");

    }
}
