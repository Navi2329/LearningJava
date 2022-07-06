//for (initialization;condition;inc/decr){code to be executed}
//while (condition){code to be executed}
/*
do{loop body}while(condition); //executes atleast once
 */

public class loops {
    public static void main(String[] args) {
        int i;
        for (i=1;i<=10;i++){System.out.println(i);}
        while (i<20){System.out.println(i);i++;}
        do{System.out.println(i);i++;}while(i==0); //even though i!=0 20 is printed
    }
}
