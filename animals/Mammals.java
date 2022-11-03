package animals;

public abstract class Mammals extends Animals {

    protected final String livingEnvironment;

    protected  int speedMovement;

    public Mammals(String nikname, int age, String livingEnvironment, int speedMovement) {
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

   // @Override
    //public void eat() {

    //}


}
