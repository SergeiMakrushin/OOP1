package animals;

import java.util.Objects;

public class Flightless extends Birds {
    protected final String typeMovement;

    public Flightless(String nikname, int age, String livingEnvironment, String typeMovement) {
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


    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }

    @Override
    public void hunt() {

    }

    public static void walking() {
    }

    @Override
    public String toString() {
        return "Кличка " + getNikname()+
                ", возраст "+getAge()+
               ", среда обитания "+ livingEnvironment +
                ", тип передвижения - "+typeMovement +".";
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Flightless that = (Flightless) o;
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
