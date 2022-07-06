import java.util.Scanner;
public class construct {
    int id;
    construct(){
        System.out.println("Default Constructor called:");
        id=0;
        System.out.println(id);
    }
    construct(int x){
        System.out.println("Parameterised Constructor called:");
        id=x;
        System.out.println(id);
    }
    public static void main(String[] args) {
        int x;
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        construct obj1=new construct();
        construct obj2=new construct(x);
    }
}
