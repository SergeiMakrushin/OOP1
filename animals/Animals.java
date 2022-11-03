package animals;

public abstract class Animals {
    private String nikname;
    private int age;

    public Animals(String nikname, int age) {
        setNikname(nikname);

        setAge(age);
    }

    public String getNikname() {
        return nikname;
    }

    public void setNikname(String nikname) {
        if (nikname != null && !nikname.isBlank()) {
            this.nikname = nikname;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.abs(age);
    }



    public static void sleep() {
    }

    public abstract void eat();

    public abstract void go();



}
