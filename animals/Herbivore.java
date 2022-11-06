package animals;

import java.util.Objects;

public class Herbivore extends Mammal {
    private final String typeFood;

    public Herbivore(String nikname, int age, String livingEnvironment, int speedMovement, String typeFood) {
        super(nikname, age, livingEnvironment, speedMovement);
        if (typeFood == null || typeFood.isBlank()) {
            this.typeFood = "Некорректное значение";
        } else {
            this.typeFood = typeFood;
        }

    }

    public String getTypeFood() {
        return typeFood;
    }


    @Override
    public void eat() {
        System.out.println("питаються растительной пищей");

    }

    @Override
    public void go() {
        System.out.println("бегают и ходят");

    }

    @Override
    public void walk() {
        System.out.println("гуляют на полях");
    }

    public static void graze() {
        System.out.println("пасуться на лугах и полях");
    }

    @Override
    public void sleep() {
        System.out.println("спят ночью");
    }

    @Override
    public String toString() {
        return "Кличка " + getNikname() +
                ", возраст " + getAge() +
                ", среда обитания " + getLivingEnvironment() +
                ", скорость передвижения "
                + getSpeedMovement() + "км/ч, тип пищи "
                + typeFood + ".";
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Herbivore that = (Herbivore) o;
        return getNikname().equals(that.getNikname()) &&
                this.getAge() == getAge() &&
                this.getSpeedMovement() == getSpeedMovement() &&
                getLivingEnvironment().equals(that.getLivingEnvironment()) &&
                typeFood.equals(that.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeFood);
    }
}
