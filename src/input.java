import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
public class input{
    public static void main(String args[]){
        Scanner scr=new Scanner(System.in);
        /*
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));  //BufferedReader constructor has a parameter of InputStreamReader()
        Buffered reader can take only String input with readLine() method //drawbacks
        int x=Integer.parseInt(input.readLine()); //typecasting to integer //Same can be done using Scanner
        */
        int num,rem;
        String name;
        System.out.print("Enter a number: ");
        num=scr.nextInt();
        scr.nextLine();
        name=scr.nextLine();
        rem=num%2;
        if (rem==0){
            System.out.println("Hello "+name+"!");
            System.out.println(num+" is Even");
        }
        else {
            System.out.println("Hello " + name + "!");
            System.out.println(num + " is Odd");
        }
    }
}
