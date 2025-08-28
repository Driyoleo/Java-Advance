package lesson06;


// first class
class GrandFather{
    String name ;
    String hairColor = "red" ;
    String nose = "long" ;
    String eyeColor = "Brown" ;

    // constructors
    public GrandFather(){
        System.out.println("Grandfather constructor.. called !");
    }

    public GrandFather(String name){
        this.name = name ;
    }

    // class methods
    public void show(){
        System.out.println(name + "'s features..\nHair Color : " + hairColor + "\nNose : " + nose + "\nEye Color : " + eyeColor);
    }
}

// second class -> Single Inheritance
class Father extends GrandFather {

    // initializer
    {
        hairColor = "blond" ;
    }

    // constructors
    public Father(){
        System.out.println("Father constructor.. called !");
    }

    public Father(String name){
        super(name);
    }

}

// third class -> Multilevel Inheritance

class Son extends Father {

    // initializer
    {
        eyeColor = "black" ;
    }

    // constructors
    public Son(){
        System.out.println("Son constructor.. called !");
    }

    public Son(String name){
        super(name);
    }
}

// fourth class -> Hierarchical Inheritance
class Daughter extends Father {

    // initializer
    {
        nose = "short" ;
    }

    // constructors
    public Daughter(){
        System.out.println("Daughter constructor.. called !");
    }

    public Daughter(String name){
        super(name);
    }
}

public class inheritanceTypes {
    public static void main(String[] args) {


        Son rahul = new Son("Rahul") ;
        rahul.show();

        Daughter nikita = new Daughter("Nikita") ;
        nikita.show();



    }
}