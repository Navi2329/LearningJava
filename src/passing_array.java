import java.util.Scanner;

public class passing_array {
    void printArray(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    int[] returnArray(){
        int array[]=new int[] {0,0,0,0,0};
        return array;
    }

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        passing_array obj=new passing_array();
        int n=scr.nextInt();
        int arr[]= obj.returnArray();
        for (int i=0;i<n;i++){
            arr[i]=scr.nextInt();
        }
        obj.printArray(arr);

    }
}
