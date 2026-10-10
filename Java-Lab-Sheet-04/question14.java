
class Person {
    String name;
    int age;
    static String country = "India";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void checkEligibility() {
        int votingAge = 18;

        System.out.println("Name: " + name);
        System.out.println("Country: " + country);

        if (age >= votingAge) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
}

public class question14 {
    public static void main(String[] args) {
        String personName = "Rahul";
        int personAge = 20;

        Person p = new Person(personName, personAge);
        p.checkEligibility();
    }
}
