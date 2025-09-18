package lesson15 ;


@FunctionalInterface
interface A{
    void show() ;
}


public class functionalInterface {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void show() {
                System.out.println("in show");
            }
        } ;

        a.show();
    }
}