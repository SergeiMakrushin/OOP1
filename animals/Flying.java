package animals;

import java.util.Objects;

public class Flying extends Birds {
    protected final String typeMovement;

    public Flying(String nikname, int age, String livingEnvironment, String typeMovement) {
        super(nikname, age, livingEnvironment);
        if (typeMovement == null || typeMovement.isBlank()) {
            this.typeMovement = "Неккоректное значение";
        } else {
            this.typeMovement = typeMovement;
        }
    }

    public String getTypeMovement() {
        return typeMovement;
    }


    public void eat() {

    }

    @Override
    public void go() {

    }

    public void hunt() {
    }

    public static void flying() {
    }

    @Override
    public String toString() {
        return "Кличка " + getNikname() +
                ", возраст " + getAge() +
                ", среда обитания " + livingEnvironment +
                ", тип передвижения - " + typeMovement + ".";
    }

    @Override
    public boolean equals(Object o) {
        //if (this == o) return true; String nikname, int age, String livingEnvironment, String typeMovement
        if (o == null || getClass() != o.getClass()) return false;
        Flying that = (Flying) o;
        return getNikname().equals(that.getNikname())&&
                this.getAge()==getAge()&&
                livingEnvironment.equals(that.livingEnvironment)&&
                typeMovement.equals(that.typeMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeMovement);
    }
}
