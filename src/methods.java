public class methods {
    public int add(int x){
        return x;
    }
    public int add(int x,int y){
        return x+y;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
    public static void main(String[] args) {
        methods obj=new methods();
        System.out.println(obj.add(3));
        System.out.println(obj.add(3,4));
        System.out.println(obj.add(3,4,5));
    }
}
