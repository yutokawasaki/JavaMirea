package Lab3;

import java.lang.*;

public abstract class Dog {
    private String breed;
    private String size;
    private String weight;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public String getSize() {
        return size;
    }

    public Dog(String breed, String size, String weight) {
        this.breed = breed;
        this.size = size;
        this.weight = weight;
    }

    public abstract void displayInfo();
}

class Bulldog extends Dog {
    private String name;
    public Bulldog(String breed, String size, String weight) {
        super(breed, size, weight);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void displayInfo(){
        System.out.println("Имя: " + name + " Порода: " + super.getBreed() + " Размер: " + super.getSize() + " Вес: " + super.getWeight());
    }
}