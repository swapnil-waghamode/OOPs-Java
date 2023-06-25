package vishwasiroops.inheritancedemo.hasArelation;

import vishwasiroops.inheritancedemo.hasArelation.Car;

public class Person extends Car {


    String name;

    // Person has- A car Association
    Car car;

    Person(String name)
    {
        this.name = name;

    }


}
