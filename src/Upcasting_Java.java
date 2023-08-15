
class Bike{
    void run(){
        System.out.println("The bike is running");
    }

}
class Splender extends Bike{
    void run(){
//        super.run();
        System.out.println("the splender is runnning with 60km per hour");
    }

}
public class Upcasting_Java {
    public static void main(String[] args) {
        Bike b1 = new Splender();
        b1.run();
    }

}
