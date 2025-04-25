package Q9_AnimalSound;



public class Dog extends Animal {

    @Override
    public void makeSound(){
        super.makeSound(); // Calling the base class method
        System.out.println("Dogs make sound");
    }

}
