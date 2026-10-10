
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat is meowing.");
    }
}

class question13 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.makeSound();
        c.makeSound();
    }
}
