import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat barsic = new Cat("Barsik", LocalDate.of(1993, 10, 1), new ArrayList<>(), "Chymka", "Boss", 4);

        System.out.println(barsic);
        System.out.println(barsic.getLegsCount());
        Animal eagle = new Eagle("Kesha", LocalDate.of(1993, 10, 1), new ArrayList<>(), "Chymka", "Boss");
        Animal parrot = new Parrot("Sebastyan", LocalDate.of(2005, 5, 5), new ArrayList<>(), "Chymka", "Boss");
        Animal fish = new Fish("Dory", LocalDate.of(2006, 6, 1), new ArrayList<>(), "Chymka", "Boss");
        Animal shark = new Shark("Baby", LocalDate.of(2007, 7, 2), new ArrayList<>(), "Chymka", "Boss");
        Animal dog = new Dog("Hot", LocalDate.of(2008, 8, 2), new ArrayList<>(), "Chymka", "Boss");
        Animal horse = new Horse("Spirit", LocalDate.of(2009, 9, 3), new ArrayList<>(), "Chymka", "Boss");
        Animal duck = new Duck("Govard", LocalDate.of(2010, 10, 5), new ArrayList<>(), "Chymka", "Boss");
//        List<Animal> animals = new ArrayList<>();
//        animals.add(barsic);
//        animals.add(eagle);

//        eagle.wakeup();
//        eagle.wakeup(2);
        System.out.println("-------------------");
        barsic.lifeCykle();
        barsic.fly();
        barsic.toGo();
        barsic.swim();
        System.out.println("-------------------");
        eagle.fly();
        eagle.toGo();
        eagle.swim();
        System.out.println("-------------------");
        parrot.fly();
        parrot.toGo();
        parrot.swim();
        System.out.println("-------------------");
        duck.fly();
        duck.toGo();
        duck.swim();
        System.out.println("-------------------");
        fish.fly();
        fish.toGo();
        fish.swim();
        System.out.println("-------------------");
        horse.fly();
        horse.toGo();
        horse.swim();
        System.out.println("-------------------");
        shark.fly();
        shark.toGo();
        shark.swim();
        System.out.println("-------------------");
        dog.fly();
        dog.toGo();
        dog.swim();
    }

}

