import java.time.LocalDate;
import java.util.List;

public class Horse extends Animal {
    public Horse(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }
    public void fly() {
        System.out.println("Horses can't fly!");
    }
}
