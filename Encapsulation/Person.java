package vishwasiroops.encapsulationdemo;

public class Person {

    // encapsulation : binding data and methods and providing controlled access using getters and setters
    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
