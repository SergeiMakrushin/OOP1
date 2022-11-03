package animals;

public abstract class Birds extends  Animals {
    protected final String livingEnvironment;

    public Birds(String nikname, int age, String livingEnvironment) {
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


    public abstract void hunt();


}
