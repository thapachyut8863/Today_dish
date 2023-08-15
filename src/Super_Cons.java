class Animals_SUper{
    Animals_SUper(){
        System.out.println("Animals love you");
    }
}
class Dog1 extends  Animals_SUper{
    Dog1(){
        super();
        System.out.println("Human loves dog");
    }
}

public class Super_Cons {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1();

    }
}
