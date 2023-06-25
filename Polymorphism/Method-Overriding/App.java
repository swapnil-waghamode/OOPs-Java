package vishwasiroops.polymorphism.methodoverriding;

public class App {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.eat();
        p1.sing();


        // here p2 represent child while runtime
        Parent p2 = new Child();
        p2.eat();
        p2.sing();
    }
}
