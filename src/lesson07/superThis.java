package lesson07 ;



class Parent{

    // variables
    String name ;
    String bodyType  ;

    // constructors
    public Parent() {
        System.out.println("Parent constructor called!!");
    };

    public Parent(String name ,String bodyType){
        this.name = name ;
        this.bodyType = bodyType ;
    }

    // methods
    public void show(){
        System.out.println("Parent body type : " + bodyType);
    }
}

class Child extends Parent{


    // variables
    String name ;
    String bodyType ;



    // constructors
    public Child(){
        super();
        System.out.println("Child Constructor Called!!");
    }

    public Child(String name , String bodyType){
        this() ;
        this.name = name ;
        this.bodyType = bodyType ;
    }

    // methods
    public void show(){
        System.out.println("Child body type : " + bodyType);
    }

    public void showP(){
        super.show();
    }

    public void setP(Parent obj){
        super.name = obj.name ;
        super.bodyType = obj.bodyType ;
        this.showP();
    }
}





public class superThis {
    public static void main(String[] args) {

        // parent object
        Parent robert = new Parent("robert" , "mesomorph") ;

        // child object
        Child sam = new Child("sam" ,"ectomorph") ;

        // setting Parent for sam
        sam.setP(robert);

        // output
        sam.show();
    }
}