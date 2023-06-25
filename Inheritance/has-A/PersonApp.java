package vishwasiroops.inheritancedemo.hasArelation;

public class PersonApp {
    public static void main(String[] args) {
        // Default Car
        Car c = new Car();
        c.name = "BMW";
        c.color ="White";
        System.out.println(c.name);
        System.out.println(c.color);

        System.out.println("-----------------------------------------------");
        Person p = new Person("Swapnil");
        System.out.println("Person name is :"+p.name);

        // Association (has - A)
        p.car = new Car();
        p.car.name = "Ferrari";
        p.car.color = "Blue";

        System.out.println( p.name+" has "+p.car.color+" "+p.car.name);


        // Association is of two types : aggregation and composition

    }
}
