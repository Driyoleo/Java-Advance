package lesson03;

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

    // instance variable
    String name ;
    int marks ;

    // show method
    public void show(){
        System.out.println(name + " : " + marks);
    }
}

public class Constructor_staticBlock {

    public static void main(String[] args) {

        Student aryan = new Student("Aryan" , 67) ;
        Student subham = new Student("Subham" , 78) ;

        System.out.println();       // just for line break in output
        System.out.println("class " + Student.standard + " results ..");
        aryan.show();
        subham.show();


    }
}