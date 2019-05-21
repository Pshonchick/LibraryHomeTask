import java.util.concurrent.Semaphore;

public class Door extends Semaphore {

    public Door(int permits) {
        super(permits);
    }

    public Door(int permits, boolean fair) {
        super(permits, fair);
    }
}
