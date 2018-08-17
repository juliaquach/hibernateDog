package company;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dog {

    @Id
    private int id;
    private DogName name;
    private String breed;
    private String color;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int name) {
        this.id = id;
    }

    public DogName getName() {
        return name;
    }

    public void setName(DogName name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name=" + name +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
