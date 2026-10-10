
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }

    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.sleep();
        d.bark();
    }
}
