import java.util.concurrent.TimeUnit;

public class Human extends Thread {
    Library library;
    Door door;


    @Override
    public void run() {
        System.out.println(this.getName() + " пришел ко входу в библиотеку");

        try {
            if (library.getPeopleInLibraryCounter() >= library.getMaxCounter()) {
                System.out.println(this.getName() + " ждет входа в библиотеку");
            }
            library.acquire();
            library.increasePeopleInLibraryCounter();

            door.acquire();

            System.out.println(this.getName() + " подошел к двери с улицы");
            System.out.println(this.getName() + " проходит через дверь внутрь");
            sleep(TimeUnit.MILLISECONDS.toMillis(500));//500
            System.out.println(this.getName() + " прошел через дверь внутрь");
            door.release();

            System.out.println(this.getName() + " вошел в библиотеку");

            System.out.println(this.getName() + " читает книгу");
            sleep((TimeUnit.MILLISECONDS.toMillis((long) (1000 + Math.random() * 4000))));//

            System.out.println(this.getName() + " вышел из библиотеки");

            door.acquire();

            System.out.println(this.getName() + " подошел к двери изнутри");
            System.out.println(this.getName() + " проходит через дверь наружу");
            sleep(500);
            System.out.println(this.getName() + " прошел через дверь наружу");
            door.release();
            library.release();
            library.decreasePeopleInLibraryCounter();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
