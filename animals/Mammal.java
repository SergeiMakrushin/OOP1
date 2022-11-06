package animals;

import java.util.Objects;

public abstract class Mammal extends Animal {

    private final String livingEnvironment;

    private   int speedMovement;

    public Mammal(String nikname, int age, String livingEnvironment, int speedMovement) {
        super(nikname, age);
        if (livingEnvironment == null || livingEnvironment.isBlank()) {
            this.livingEnvironment = "некорректное значение";
        } else {
            this.livingEnvironment = livingEnvironment;
        }

        setAge(age);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }



    public int getSpeedMovement() {
        return speedMovement;
    }

    public void setSpeedMovement(int speedMovement) {
        this.speedMovement = Math.abs(speedMovement);
    }

    public abstract  void walk();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speedMovement == mammal.speedMovement && livingEnvironment.equals(mammal.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speedMovement);
    }
}
