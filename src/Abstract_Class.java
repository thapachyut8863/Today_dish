abstract class Animals2{
    public abstract void  sound();

}
class Dog_a extends  Animals2{
    public void sound(){
        System.out.println("the dog is barking");
    };

}
class Tiger extends Animals2{
    public void sound(){
        System.out.println("the tiger roars");
    }

}


public class Abstract_Class {
    public static void main(String[] args) {
        Animals2 a1 = new Dog_a();
        a1.sound();
        Animals2 a2 = new Tiger();
        a2.sound();

    }
}
