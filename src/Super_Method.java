class Animals_Test{
    void eat(){
        System.out.println("ALl animal eat to live");
    }
}
class Dog extends Animals_Test{
    @Override
    void eat(){
        System.out.println("Dog eat meat");
    }
    void ACT(){
        super.eat();
        eat();
    }
}
public class Super_Method {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.ACT();
    }

}
