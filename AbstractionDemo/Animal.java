package vishwasiroops.abstractiondemo;

// abstract class
public abstract class Animal {
// We cannot create object of abstract class it should be inherited first
    // abstract method
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Animal is sleeping ");
    }
}
