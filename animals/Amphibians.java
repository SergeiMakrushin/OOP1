package animals;

import java.util.Objects;

public class Amphibians extends Animals {
    protected final String livingEnvironment;

    public Amphibians(String nikname, int age, String livingEnvironment) {
        super(nikname, age);
        if (livingEnvironment == null || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Неккоректное значение";
        } else {
            this.livingEnvironment = livingEnvironment;
        }

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }


    public void eat() {

    }

    @Override
    public void go() {

    }

    public static void hunt() {
    }

    @Override
    public String toString() {
        return "Кличка " + getNikname() +
                ", возраст " + getAge() +
                ", среда обитания " + livingEnvironment + ".";
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return getNikname().equals(that.getNikname()) &&
                this.getAge() == getAge() &&
                livingEnvironment.equals(that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }
}
