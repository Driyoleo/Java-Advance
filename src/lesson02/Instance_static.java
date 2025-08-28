package lesson02;

// lesson 2: Instance and Static variable and methods


// class
class Product{

    static String name ;
    String color ;

    public void show(){
        System.out.println(name + " : " + color);
    }

    /*
        // wrong static method definition
    public static void show(){
        System.out.println(name + " : " + color);
    }
     */
}


public class Instance_static {
    public static void main(String[] a){

        // initialization of static variable
        Product.name = "pen" ;

        // initialization of instance variable among objects
        Product pen1 = new Product() ;
        pen1.color = "black" ;

        Product pen2 = new Product() ;
        pen2.color = "blue" ;

        // output
        pen1.show();
        pen2.show();

    }
}