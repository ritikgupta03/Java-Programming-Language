package Oops.Abstraction;

// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Normal method (common for all)
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Dog class extends Animal
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Cat class extends Animal
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// Main class with main() method
public class AbstractionExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
    }
}
