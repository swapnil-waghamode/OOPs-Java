package vishwasiroops.polymorphism.methodoverloading;

import vishwasiroops.polymorphism.methodoverloading.Calculator;

public class CalcApp {
    public static void main(String[] args) {

        // method overloading -> compile time polymorphism
        Calculator c = new Calculator();
        int res = c.add(10,20);
        System.out.printf("sum is  : %d\n",res);

        int res1 = c.add(10,20,30);
        System.out.println("Sum of 3 numbers is :"+ res1);

//       int res3 =  c.add(10,20,30,40); this will show compile time error because method with this signature
        // is not available

    }
}
