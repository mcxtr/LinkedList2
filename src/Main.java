import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Cats> cats = new ArrayList<>();
        ArrayList<Dogs> dogs = new ArrayList<>();
        ArrayList<Mouse> mice = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int a = random.nextInt(1, 5);
            cats.add(new Cats("Cat" + i, a));
            dogs.add(new Dogs("Dog" + i, a));
        }
        cats.remove(4);

        System.out.println(cats);
        System.out.println(dogs);

        for (int i = 0; i < dogs.size(); i++) {
            if (i % 3==0){
                int b = random.nextInt(1,10);
                mice.add(new Mouse("Mouse",b));
            }
        }


        LinkedList<Object> allAnimals = new LinkedList<>();
        allAnimals.add(cats);
        allAnimals.add(dogs);
        allAnimals.add(mice);


        System.out.println(allAnimals);

    }
}