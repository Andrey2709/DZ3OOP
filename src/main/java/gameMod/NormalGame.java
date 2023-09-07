package gameMod;

import java.util.Random;

public class NormalGame implements Mod {
    @Override
    public void info() {

    }

    @Override
    public boolean result(String answer) {
        return false;
    }





    public static String makeWord() {
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 8;
        int randomLimitedInt = 0;
         Random random = new Random();
         StringBuilder buffer = new StringBuilder(targetStringLength);
         for (int i = 0; i < targetStringLength; i++) {
             randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
             buffer.append((char) randomLimitedInt);
         }
         String generatedString = buffer.toString();
         System.out.println(generatedString);
        return  generatedString;
    }
}
