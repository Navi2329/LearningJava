package package1;
import package1.subclass;
public class Myclass extends subclass{
    public static void main(String[] args) {
        subclass obj=new subclass();
        obj.show();
        obj.print();
        System.out.println(obj.y);
        System.out.print(obj.z); //because of inheritance
    }
}
