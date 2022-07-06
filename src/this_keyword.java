public class this_keyword {
    int num;
    void func1(this_keyword obj,int num){
        System.out.println("Function 1 called");
        this.num=num; //this.num refers to the instance variable while num refers to argument
        System.out.println(this.num);
    }
    void func2(){
        func1(this,5);  //this refers to the object of this_keyword class
    }
    this_keyword get(){
        return this; //returns object of class
    }
    void display(){
        System.out.println("num="+this.num);
    }

    public static void main(String[] args) {
        this_keyword obj=new this_keyword();
        obj.func2();
        obj.get().display();//get() method used to access num
    }
}
