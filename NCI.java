// LOGIC /////////////////
public class NCI {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}



// CLASSES /////////////////
class Car {
    // Properties
    String brand;
    String model;
    String licenseNumber;
}

// Super/Parent class
class Person {
    // Properties
    String fullName;
    String address;
}

class Customer {
    String fullName;
    String address;
    int age;
    String customerId;
}

// class Customer extends Person { // class Customer : Person { CODE HERE }
//     String customerId;
//     Car car;
// }

class SalesPerson extends Person {

}

// DRY - Don't Repeat Yourself