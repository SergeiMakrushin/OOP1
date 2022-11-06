package animals;

import java.util.Objects;

public class Flightless extends Bird {
   private final String typeMovement;

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
        System.out.println("могут питаться рыбой, насекомыми, растительной пищей и животными в зависимости от вида");

    }

    @Override
    public void go() {
        System.out.println("плавают и ходят");

    }

    @Override
    public void hunt() {
        System.out.println("охотяться днем и ночью");

    }

    @Override
    public void sleep() {
        System.out.println("спят в недоступных для хищников местах ");
    }

    public static void walking() {
        System.out.println("гуляют по земле");
    }

    @Override
    public String toString() {
        return "Кличка " + getNikname()+
                ", возраст "+getAge()+
               ", среда обитания "+ getLivingEnvironment() +
                ", тип передвижения - "+typeMovement +".";
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Flightless that = (Flightless) o;
        return getNikname().equals(that.getNikname())&&
                this.getAge()==getAge()&&
                getLivingEnvironment().equals(that.getLivingEnvironment())&&
                typeMovement.equals(that.typeMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeMovement);
    }
}
