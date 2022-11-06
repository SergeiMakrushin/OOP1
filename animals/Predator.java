package animals;

import java.util.Objects;

public class Predator extends Mammal {
    private final String typeFood;

    public Predator(String nikname, int age, String livingEnvironment, int speedMovement, String typeFood) {
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
        System.out.println("едят других животных");

    }

    @Override
    public void go() {
        System.out.println("ходят на 4 ногах");

    }

    @Override
    public void walk() {
        System.out.println("гуляют в лесу");

    }

    public static void hunt() {
        System.out.println("охотяться ночью");
    }

    @Override
    public void sleep() {
        System.out.println("спят днём");
    }

    @Override
    public String toString() {
        return "Кличка " + getNikname() +
                ", возраст " + getAge() +
                ", среда обитания " + getLivingEnvironment() +
                ", скорость передвижения "
                + getLivingEnvironment() + "км/ч, тип пищи "
                + typeFood + ".";
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Predator predators = (Predator) o;
        return getNikname().equals(predators.getNikname()) &&
                this.getAge() == getAge() &&
                this.getSpeedMovement() == getSpeedMovement() &&
                getLivingEnvironment().equals(predators.getLivingEnvironment()) &&
                typeFood.equals(predators.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeFood);
    }
}
