import java.time.LocalDate;
import java.util.List;

public class Parrot extends Animal {
    public Parrot(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    public void swim() {
        System.out.println("Parrots can't swim");
    }
}

