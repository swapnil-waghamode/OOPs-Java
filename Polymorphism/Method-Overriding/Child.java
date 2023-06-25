package vishwasiroops.polymorphism.methodoverriding;

public class Child extends Parent{

    // overriding : acquiring properties of parent and modify it in child class , also called runtime polymorphism
    @Override
    public void eat() {
        System.out.println("Child is eating");
    }

    @Override
    public void sing() {
        System.out.println("Child is singing");
    }
}
