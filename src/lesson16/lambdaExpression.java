package lesson16 ;

interface A{
    void show() ;
}

interface B{
    void show(String message) ;
}

interface C{
    int add(int n1 ,int n2) ;
}



public class lambdaExpression {
    public static void main(String[] args) {

        // wihtout parameter
//        A a = new A() {
//            @Override
//            public void show() {
//                System.out.println("in show");
//            }
//        } ;

        A a = ()->{
            System.out.println("in show");
        } ;

        // with parameter
//        B b = new B() {
//            @Override
//            public void show(String message) {
//                System.out.println(message);
//            }
//        } ;

        B b = message ->{
            System.out.println(message);
        };


        // with return statement
//        C c = new C() {
//            @Override
//            public int add(int a, int b) {
//                return a+b;
//            }
//        } ;

        C c = (n1 , n2) -> n1+n2 ;


        // output
        a.show();
        b.show("hellllo!!");
        System.out.println(c.add(1,2)) ;
    }
}