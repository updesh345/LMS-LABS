// Superclass: Animal
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass: Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass: Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class
import java.util.Scanner;

public class AnimalSoundDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an animal: 1. Dog  2. Cat  3. Generic Animal");
        int choice = scanner.nextInt();

        Animal animal;
        switch (choice) {
            case 1:
                animal = new Dog();
                break;
            case 2:
                animal = new Cat();
                break;
            case 3:
            default:
                animal = new Animal();
        }

        // Call the makeSound method
        animal.makeSound();

        scanner.close();
    }
}
