
public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("dog");
        dog.sound();
        Animal cat = AnimalFactory.getAnimal("cat");
        cat.sound();

    }
}
