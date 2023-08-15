import java.util.Scanner;

interface client{
    void input();
    void output();
}
class Achyut implements  client{
    String name; Double salary;

    public void input(){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = s1.nextLine();
        System.out.println("Enter your salary");
        salary = s1.nextDouble();

    }
    public void output(){
        System.out.println(name + " " + salary );
    }

    }


public class InterFace_Java {
    public static void main(String[] args) {
        client c1 = new Achyut();
        c1.input();
        c1.output();
    }
}
