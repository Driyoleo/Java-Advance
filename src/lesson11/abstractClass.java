package lesson11 ;

// abstract class
abstract class Human{

    // variables
    String name;
    int age ;
    String gender ;

    // constructor
    public Human(String name , int age){
        this.name = name ;
        this.age = age ;
    }

    // abstract method
    abstract public String favTask() ;

    // concrete method
    @Override
    public String toString() {
        return name + " is a " + gender + " of " + age + " loves to " + favTask() ;
    }

}

// concrete class
class Male extends Human{

    // initializer
    {
        gender = "Male" ;
    }

    // constructor
    public Male(String name , int age){
        super(name , age);
    }

    // implementation of abstract class
    public String favTask(){
        return "play basketball";
    }

}

class Female extends Human{

    // initializer
    {
        gender = "Female" ;
    }

    // constructor
    public Female(String name ,int age){
        super(name , age) ;
    }

    // implementation abstract class
    public String favTask(){
        return "watch K Drama" ;
    }
}

public class abstractClass {
    public static void main(String[] args) {

         // Human sam = new Human() ; - error

        // object creation
        Male sam = new Male("Sam" , 45) ;
        Female laila = new Female("Laila" , 18) ;

        // output
        System.out.println(sam);
        System.out.println(laila);
    }
}