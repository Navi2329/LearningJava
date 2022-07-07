class superclass{
    final void print(){ //final methods cannot be overridden or else error
        System.out.println("Superclass Method");
    }
}

final class subclass{ //cannot be inherited or immutable class
    int x;
    void show(){
        System.out.println(x);
    }
}
public class FINAL extends superclass{
    final int CONSTANT; //final variables,methods,classes are constants
    { //this is a block code which can be executed before Constructors
        System.out.println("Init Block");
        CONSTANT=5; //needs to be initialised or else error
    } //Executes before Constructor
    FINAL(){
        System.out.println("Default Constructor");
    }
    public static void main(String[] args) {
        FINAL obj=new FINAL();
        obj.print();
    }
}