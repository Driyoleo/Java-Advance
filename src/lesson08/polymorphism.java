package lesson08 ;


// first class
class Parent{

    // variables
    public String name ;

    // constructor
    public Parent(String name){
        this.name = name ;
    }

    // methods
    public void favTask(){
        System.out.println(name + " favourite task is football") ;
    }

    // - overloading
    public void favTask(String time){
        System.out.println(name + " favourite task is newspaper at " + time );
    }
}

// second class
class Child extends Parent{

    // constructor
    public Child(String name){
        super(name);
    }

    // - overriding
    public void favTask(){
        System.out.println(name + " favourite task is Online gaming");
    }
}

public class polymorphism {
    public static void main(String[] args) {

        // objects
        Parent ramesh = new Parent("Ramesh") ;
        Child aditya = new Child("Aditya") ;

        // output
        ramesh.favTask();
        ramesh.favTask("morning");
        aditya.favTask();
    }
}