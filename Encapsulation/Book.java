package vishwasiroops.encapsulationdemo;

public class Book {

    String name;
    int numberOfPages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if(numberOfPages < 150)
        {
            this.numberOfPages = numberOfPages;
        }
        else{
            System.out.println("Limit exceed !");
        }
    }
}
