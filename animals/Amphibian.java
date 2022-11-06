package animals;

import java.util.Objects;

public class Amphibian extends Animal {
    private final String livingEnvironment;

    public Amphibian(String nikname, int age, String livingEnvironment) {
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
        System.out.println("амфибии питаются насекомыми, рыбой и небольшими млекопитающими");

    }

    @Override
    public void go() {
        System.out.println("умеют плавать и передвигаться по суше");

    }

    public void hunt() {
        System.out.println("амфибии охотяться ночью, добыча должна двигаться");
    }

    @Override
    public void sleep() {
        System.out.println("спят днем, в укрытии");
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
        Amphibian that = (Amphibian) o;
        return getNikname().equals(that.getNikname()) &&
                this.getAge() == getAge() &&
                livingEnvironment.equals(that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }
}
