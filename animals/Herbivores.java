package animals;

import java.util.Objects;

public class Herbivores extends Mammals {
    protected final String typeFood;

    public Herbivores(String nikname, int age, String livingEnvironment, int speedMovement, String typeFood) {
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

    }

    @Override
    public void go() {

    }

    @Override
    public void walk() {

    }

    public static void graze() {
    }

    @Override
    public String toString() {
        return "Кличка " + getNikname() +
                ", возраст " + getAge() +
                ", среда обитания " + livingEnvironment +
                ", скорость передвижения "
                + speedMovement + "км/ч, тип пищи "
                + typeFood + ".";
    }

    @Override
    public boolean equals(Object o) {
        // if (this == o) return true;(nikname, age, livingEnvironment, speedMovement)
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return getNikname().equals(that.getNikname()) &&
                this.getAge() == getAge() &&
                this.speedMovement==speedMovement&&
                livingEnvironment.equals(that.livingEnvironment) &&
                typeFood.equals(that.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeFood);
    }
}
