package Q9_AnimalSound;

public class Main {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myCat.makeSound(); // This will call the Cat's overridden method
        myDog.makeSound();
    }
}
