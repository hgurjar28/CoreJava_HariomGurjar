package Q9_AnimalSound;

public class Cat extends Animal {

    @Override
    public void makeSound(){
        super.makeSound(); // Calling the base class method
        System.out.println("Cats make sound");
    }

}
