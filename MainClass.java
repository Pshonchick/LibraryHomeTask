import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    //        boolean flag = true; //if true you can come in;
    // TODO: 2019-05-18 read AtomicBoolean

//    public static int peopleCount;
//    public static int maxAmount;

    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {


            System.out.println("Write number of people");
            int peopleCount = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Write max people in library");
            int maxAmount = Integer.parseInt(bufferedReader.readLine());


            Library library = new Library(maxAmount, true);
            Door door = new Door(1);

            List<Human> humanList = new ArrayList<>();

            for (int i = 0; i < peopleCount; i++) {
                humanList.add(new Human());
            }

            for (Human h : humanList) {
                h.library = library;
                h.door = door;
                h.start();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
