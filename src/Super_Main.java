class Person{
    int id;
    String name;
    Person(int id, String name){
        this.id = id ;
        this.name = name;

    }
    void PrintInfo(){
        System.out.println("Your id:" + id + "Your name is:"+name);
    }
}
class emp extends Person{
    float salary;
    emp(int id, String name, float salary){
        super(id, name);
        this.salary = salary;

    }
    void PrintInfo(){
        System.out.println("your name is"+ name + "your id is:" + id + "Your salary is:"+ salary);

    }}

public class Super_Main {
    public static void main(String[] args) {
        emp e1 = new emp(12, "Achyut", 12345);
        e1.PrintInfo();
    }
}
