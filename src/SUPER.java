class vehicle{
    int maxspeed;
    void show(){
        System.out.println("This is a vehicle");
    }
    vehicle(){}
    vehicle(int temp){
        System.out.println("Vehicle Constructor");
        int maxspeed=temp;
    }
}

class car extends vehicle{
    int maxspeed;
    car(){
        super(180);
        System.out.println("Car Constructor");
        maxspeed=120;
    }
    void show(){
        System.out.println("Maximum speed of a vehicle="+super.maxspeed);
        System.out.println("Maximum speed of car="+maxspeed);
    }
    void display(){
        super.show();
        show();
    }
}
public class SUPER {
    public static void main(String[] args) {
        car obj=new car();
        obj.show();
        obj.display();
    }
}
