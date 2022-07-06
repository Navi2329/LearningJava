//arrays are objects in java and need to be instanciated
public class arr {
    public static void main(String[] args) {
        int array[];
        array=new int[10];
        for (int i=0;i<10;i++)
            array[i]=i+1;
        for (int i=0;i<10;i++)
            System.out.print(array[i]+" ");
        System.out.println();
        int array_2d[][]={{1,2,3},{2,3,4},{3,4,5}}; //can be instanciated like 1d array
        //int array_2d[][]=new int[3][3];
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array_2d[i][j] + " ");
            }
            System.out.println();
        }
        /*
        Jagged arrays are multidimentional arrays which have variable column length
         */
        int k=5;
        int jagged[][]=new int[5][];
        for (int i=0;i<5;i++){
            jagged[i]=new int[k];
            k--;
        }
        int count=1;
        for (int i=0;i<jagged.length;i++)
            for (int j=0;j<jagged[i].length;j++)
                jagged[i][j]=count++;
        for (int i=0;i<jagged.length;i++) {
            for (int j = 0; j < jagged[i].length; j++)
                System.out.print(jagged[i][j] + " ");
            System.out.println();
        }
    }
}
