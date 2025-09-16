package lesson14 ;


enum Status{

    // named constants
    Running("Wait little..") , Faild("Try again..") , Pending("Loading..") , Success("Done") ;

    // fields
    String message ;

    // constructor
    Status(String message){
        this.message = message ;
    }

}


public class enums{
    public static void main(String[] args) {

        // accessing
        Status s = Status.Pending ;
        System.out.println(s);

        // ordinals
        System.out.println(s.ordinal());

        // accessing with switch
        switch (s){
            case Running -> {
                System.out.println("getting data...");
                break;
            }
            case Faild -> {
                System.out.println("sorry! try again.");
                break;
            }
            case Pending -> {
                System.out.println("sending request.");
            }
            default -> {
                System.out.println("Done");
            }

        }

        // accessing all named const
        Status[] service = Status.values() ;

        for (Status i : service){
            System.out.println(i + " : " + i.message);
        }







    }
}