package animals;

import java.util.Objects;

public abstract class Animal {
    private String nikname;
    private int age;

    public Animal(String nikname, int age) {
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


    public abstract void sleep();

    public abstract void eat();

    public abstract void go();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && nikname.equals(animal.nikname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nikname, age);
    }
}
