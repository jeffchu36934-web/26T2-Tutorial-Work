package thrones;

import java.util.Random;

public class CharacterFactory {
    private static Random random = new Random(System.currentTimeMillis());

    public static int getRandom() {
        return random.nextInt(5);
    }

    public static King createKing() {
        return new King(getRandom(), getRandom());
    }

    public static Queen createQueen() {
        return new Queen(getRandom(), getRandom());
    }

    public static Dragon createDragon() {
        return new Dragon(getRandom(), getRandom());
    }

    public static Knight createKnight() {
        return new Knight(getRandom(), getRandom());
    }


}
