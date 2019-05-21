import java.util.concurrent.Semaphore;

public class Library extends Semaphore {

    private int peopleInLibraryCounter;

    public int getMaxCounter() {
        return maxCounter;
    }

    private int maxCounter;

    public Library(int permits) {
        super(permits);
        peopleInLibraryCounter = 0;
        this.maxCounter = permits;
    }

    public Library(int permits, boolean fair) {
        super(permits, fair);
        peopleInLibraryCounter = 0;
        this.maxCounter = permits;
    }

    public int getPeopleInLibraryCounter() {
        return peopleInLibraryCounter;
    }

    public void increasePeopleInLibraryCounter() {
        this.peopleInLibraryCounter++;
    }

    public void decreasePeopleInLibraryCounter() {
        this.peopleInLibraryCounter--;
    }
}
