package lesson12 ;

import com.sun.tools.javac.Main;

class Land{

    // variables
    int area ;
    String soilType ;

    // constructor
    public  Land(int area , String soilType){
        this.area = area ;
        this.soilType = soilType ;
    }

    // non-static inner class
    class Home{
        String material ;
        String type ;

        public Home(String material , String type){
            this.material = material ;
            this.type = type ;
        }
    }

    // static inner class
    static class RegionDetails{
        String region ;
        String precipitation ;

        public RegionDetails(String region , String precipitation){
            this.region = region ;
            this.precipitation = precipitation ;
        }
    }

    // local inner class
    class Maintainance {
        int noOfWorker ;
        String timeDuration ;

        public Maintainance(int noOfWorker , String timeDuration){
            this.noOfWorker = noOfWorker ;
            this.timeDuration = timeDuration ;
        }

        public void cleanHome(){
            System.out.println("cleanning done !!");
        }

    }

    // creation of a local inner class object
    Maintainance service = new Maintainance(2, "30 min") ;

    // method
    public void sunday(){
        service.cleanHome();
    }
}
public class innerClass {
    public static void main(String[] args) {

        // object creation
        Land myLand = new Land(234 , "Black soil" ) ;

        // non-static inner class object creation
        Land.Home myHome = myLand.new Home("concrete" , "villa") ;

        // static inner class object creation
        Land.RegionDetails myRegion = new Land.RegionDetails("Indo–Gangetic Plain" , "1,500–2,000 mm") ;

        // anonymous inner class object creation
        Land myNewLand = new Land(268 , "Red soil"){
            @Override
            public void sunday() {
                super.sunday();
                System.out.println("renovation of garden done !!");
            }
        } ;

        // output
        myLand.sunday();
        myNewLand.sunday();

    }
}