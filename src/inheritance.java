/*
Single Inheritance-1 Superclass and 1 Subclass
Heirerchial Inheritance-1 Superclass and Multiple subclasses
Multilevel Inheritance-1 Superclass and 1 Subclass which is a superclass of other Subclass
Multiple and Hybrid Inheritance are not supported in java due to ambiguity error and simplicity of language.Can be implemented using interfaces
 */
class Animals{

    void printMessage(){
        System.out.println("Animal Method");
    }
}

class Dogs extends Animals{
    void eat(){
        System.out.println("Dogs like bone");
    }
    void sound(){
        System.out.println("Dogs bark");
    }
}
class Puppy extends Dogs{
    void print(){
        System.out.println("Puppy method");
    }
}
class Cats extends Animals{
    void eat(){
        System.out.println("Cats like fish");
    }
    void sound(){
        System.out.println("Cats meow");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Cats c1=new Cats();
        Puppy p1=new Puppy();
        p1.printMessage();
        p1.eat();
        p1.sound();
        c1.printMessage();
        c1.eat();
        c1.sound();
    }
}
