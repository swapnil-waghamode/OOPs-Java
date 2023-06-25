package vishwasiroops.abstractiondemo;

public class Dog extends Animal {

    // override abstract method
    @Override
    public void animalSound() {
        System.out.println("Dog is barking ");
    }

    // here specialised method will automatically inherit i.e , sleep()

    public static void main(String[] args) {
        Dog d = new Dog();

        d.animalSound();
        d.sleep();
    }
}
