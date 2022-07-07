
class Animal{
    void show_data(){
        System.out.println("Animal Class");
    }
}

class Dog extends Animal{
    void show_data(){
        System.out.println("Dog class");
    }

}
public class instance {
    public static void main(String[] args) {
        Dog d1=new Dog();
        if (d1 instanceof Dog){
            System.out.println("Yes");
        }
        if (d1 instanceof Animal){
            System.out.println("Yes");
        }
        Dog d2=null;
        if (!(d2 instanceof Dog)){
            System.out.println(d2 instanceof Dog);
        }
        else
            System.out.println("No");

    }
}
