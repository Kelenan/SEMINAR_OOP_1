import java.time.LocalDate;
import java.util.List;

public class Shark extends Animal {
    public Shark(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }
    public void toGo() {
        System.out.println("Sharks can't go!");
    }
    public void fly() {
        System.out.println("Sharks can't fly!");
    }
}
