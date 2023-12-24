import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal {
    public Fish(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    public void toGo() {
        System.out.println("Fishes can't go!");
    }
    public void fly() {
        System.out.println("Fishes can't fly!");
    }
}
