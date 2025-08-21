package lesson5 ;


// class 1
class Calc{

    // addition
    public int add(int a , int b){
        return a+b ;
    }

    // subtraction
    public int sub(int a , int b){
        return a-b ;
    }
}

// class 2 as an inheritance of class 1
class AdvCalc extends Calc{

    // division
    public int div(int a , int b){
        return a/b ;
    }

    // multiplication
    public int mult(int a , int b){
        return a*b ;
    }

}



public class inheritance {
    public static void main(String[] args) {

        // object declaration
        Calc calculator1 = new Calc() ;
        AdvCalc calculator2 = new AdvCalc() ;

        // output
        System.out.println("1 + 2 = " + calculator2.add(1,2));
        System.out.println("1 - 2 = " + calculator2.sub(1,2));
        System.out.println("1 / 2 = " + calculator2.div(1,2));
        System.out.println("1 * 2 = " + calculator2.mult(1,2));

    }
}