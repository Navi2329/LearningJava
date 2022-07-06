import java.util.Scanner;
public class classes {

    int id;
    String name;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        classes obj1=new classes();
        classes obj2=new classes();
        obj1.id=input.nextInt();
        obj1.name="Navaneetha Krishnan";
        obj2.id=input.nextInt();
        obj2.name="Sanjith";
        System.out.println(obj1.id);
        System.out.println(obj1.name);
        System.out.println(obj2.id);
        System.out.print(obj2.name);
    }
}
