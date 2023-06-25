package vishwasiroops.object;

public class ObjectCreation {

    // data members

    String name;
    int age;

    // method
    public void eat()
    {
        System.out.println("Dog  is eating ");
    }

    public static void main(String[] args) {
        ObjectCreation oc = new ObjectCreation();
        // accessing data members
        oc.name = "Raju";
        oc.age = 12;

        System.out.println("The name of dob name  is "+ oc.name+" and it's  age is "+oc.age);

        // accessing method

        oc.eat();

    }
}
