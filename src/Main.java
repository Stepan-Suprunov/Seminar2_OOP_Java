
public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", "Ginger");
        cat1.voice();
        cat1.jump();
        System.out.printf("Animal name: %s\n", cat1.getName());

        Animal cat2 = new Cat("Persik", "Red");
        cat2.voice();
        cat2.jump();
        System.out.printf("Animal name: %s\n", ((Cat) cat2).getColor());

        Dog dog1 = new Dog("Sharik", 9);
        dog1.voice();
        dog1.jump();
        System.out.printf("Animal name: %s\n", dog1.getName());

        CatV2 catV2_1 = new CatV2();
        CatV2 catV2_2 = new CatV2();
        DogV2 dogV2_1 = new DogV2();
        DogV2 dogV2_2 = new DogV2();
        Bird bird1 = new Bird();

        Object[] animals = new Object[]{catV2_1, catV2_2, dogV2_1, dogV2_2, bird1};

        for (Object animal : animals) {
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly(100);
            }
        }
    }
}

interface Runable {

    void swim(int distance);

    void run(int distance);
}

interface Flyable {

    void fly(int distance);
}

class CatV2 implements Runable {

    @Override
    public void swim(int distance) {

    }

    @Override
    public void run(int distance) {

    }
}

class DogV2 implements Runable {

    @Override
    public void swim(int distance) {

    }

    @Override
    public void run(int distance) {

    }
}

class Bird implements Runable, Flyable {

    @Override
    public void swim(int distance) {

    }

    @Override
    public void run(int distance) {

    }

    @Override
    public void fly(int distance) {
        System.out.println("Bird is flying");
    }
}

abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void jump() {
        System.out.println("Animal is jumping");
    }

    public abstract void voice();
}

class Cat extends Animal {
    private String color;

    public String getColor() {
        return color;
    }

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void jump() {
        System.out.println("Cat jumping");
    }

    @Override
    public void voice() {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal {
    private int weight;

    public int getWeight() {
        return weight;
    }

    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public void jump() {
        System.out.println("Dog jumping");
    }

    @Override
    public void voice() {
        System.out.println("Dog barking");
    }
}