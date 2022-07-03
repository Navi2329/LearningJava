public class conditions {
    public static void main(String[] args) {
        int a=3;
        for (int i=0;i<10;i++){
            if (a>0){
                System.out.println(a+" is a positive number");
                --a;
            }
            else if (a==0)
            {
                System.out.println(a+" is 0");
                --a;
            }
            else{
                System.out.println(a+" is a negative number");
                --a;
            }
        }
    }
}
