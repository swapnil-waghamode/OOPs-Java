package vishwasiroops.encapsulationdemo;

public class BookDemo {
    public static void main(String[] args) {
        Book b = new Book();

        b.setName("Wings of fire");
        System.out.println("Book name is :"+ b.getName());

        System.out.println("================================================");
        // here number of pages are greater than 150 so it will print default value 0
        b.setNumberOfPages(160);
        System.out.println("Number of pages :"+ b.getNumberOfPages());

        System.out.println("=================================================");
        // number of pages within limit so it will print provided value
        b.setNumberOfPages(145);
        System.out.println("Number of pages :"+ b.getNumberOfPages());
    }
}
