package lesson4 ;


class Student{

    // static block
    static {
        standard = 9 ;
        System.out.println("(static block run)");
    }

    // constructor  -- parameterised constructor
    public Student(String name , int marks){
        this.name = name ;
        this.marks = marks ;
        System.out.println("(constructor block run)");
    }

    // static variable
    static int standard ;

    // private instance variable
    private String name ;
    private int marks ;

    // show method
    public void show(){
        System.out.println(name + " : " + marks);
    }

    // private method
    public void setName(String name){
        this.name = name ;
    }

    public void setMarks(int marks){
        this.marks = marks ;
        System.out.println();
        System.out.println(name + " marks changed to " + this.marks);

    }
}

public class encapsulation {

    public static void main(String[] args) {

        // object creartion
        Student aryan = new Student("Aryan" , 67) ;
        Student subham = new Student("Subham" , 78) ;


        // output 1
        System.out.println();       // just for line break in output
        System.out.println("class " + Student.standard + " results ..");
        aryan.show();
        subham.show();

        // setting new marks of aryan
        aryan.setMarks(96);

        // output 2
        System.out.println();       // just for line break in output
        System.out.println("class " + Student.standard + " results ..");
        aryan.show();
        subham.show();



    }
}