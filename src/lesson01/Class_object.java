package lesson01;

// lesson 1: class and object

import java.util.Scanner;

// class
class Car{

    // instance variables
    String company ;
    String model ;

    // instance method
    public void getDetails(){
        System.out.println(model + " car by " + company);
    }
}


public class Class_object{
    public static void main(String[] a){
        Scanner input = new Scanner(System.in) ;

        // object initialization
        Car c1 = new Car() ;

        // input
        System.out.println("company name : ");
        c1.company = input.nextLine() ;
        System.out.println("model name : ");
        c1.model = input.nextLine() ;

        // output
        c1.getDetails();

    }
}