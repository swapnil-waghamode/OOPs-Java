package vishwasiroops.abstractiondemo;
// interface provide 100% abstraction
interface TreeDemo{
    void height();
   void color();
}
public class Tree implements TreeDemo{

    // override abstract methods from interface

    @Override
    public void height() {
        System.out.println("The height  of tree is 30 feet");
    }

    @Override
    public void color() {
        System.out.println("Color of tree leaves  is green-yellow");
    }


    public static void main(String[] args) {

        Tree t = new Tree();
        t.height();
        t.color();
    }
}
