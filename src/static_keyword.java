//static methods can only access static instances and static methods.It cannot access non-static components
//That is because static members are not allocated any memory and thus they cannot access non-static members which need an object
//which needs to be allocated memory
public class static_keyword {
    int side;
    static int count_object;
    static { //static block which gets executed before the main method
        System.out.println("Static Block Invoked");
        count_object=0;
    }
    static_keyword(){
        count_object++;
    }
    static int cube(int x){ //static method
        return x*x*x;
    }
    public static void main(String[] args) {
        static_keyword obj1=new static_keyword();
       for (int i=0;i<4;i++) {
           static_keyword obj = new static_keyword(); //The constructor will increment count_object by 1 each time
       }
        System.out.println(count_object); //count_object is static,so no need for object to access it
        System.out.println("Cube of 5 is:"+cube(5));  //no need of object
        System.out.println("Cube of 6 is:"+static_keyword.cube(6));
        System.out.println("Cube of 7 is:"+obj1.cube(7));
    }
}
