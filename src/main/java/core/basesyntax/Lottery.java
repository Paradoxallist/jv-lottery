package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_INDEX = 100;
    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), rand.nextInt(MAX_BALL_INDEX));
    }
}
