class SuperClass{
    void showClass(){
        System.out.println("Super Class");
    }
}
class Subclass extends SuperClass{
    void showClass(){
        System.out.println("Subclass class");
    }
}
public class polymorphism extends SuperClass{
    void showClass(){
        System.out.println("polymorphism Class");
    }

    public static void main(String[] args) {
        SuperClass obj=new SuperClass();
        obj.showClass();
        obj=new polymorphism();
        obj.showClass();
        obj=new Subclass();
        obj.showClass();
    }
}