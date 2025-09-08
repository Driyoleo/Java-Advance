package lesson09 ;

class Person{

    // variables
    private String name ;
    private int age ;
    private String occupation ;

    // constructor
    public Person(String name , int age , String occupation){
        this.name = name ;
        this.age = age ;
        this.occupation = occupation ;
    }


    // overriding
    @Override
    public String toString() {
        return name +" of age " + age + " work as " + occupation ;
    }
}



public class overridingUses {
    public static void main(String[] args) {

        // object
        Person ram = new Person("Ram" , 42 , "Sales Man") ;

        // output
        System.out.println(ram);
    }
}