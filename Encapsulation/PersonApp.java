package vishwasiroops.encapsulationdemo;

public class PersonApp {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Swapnil");
        System.out.println("Name of person is :"+p.getName());

        p.setPhone("9167452343");
        System.out.println("Phone number is :"+ p.getPhone());
    }
}
