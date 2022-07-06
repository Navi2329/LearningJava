public class Student {
    int roll_no;
    String name, course;
    float fees;

    Student(int roll_no, String name, String course) {
        this.roll_no = roll_no;
        this.name = name;
        this.course = course;
        fees=198000f;
    }
    Student(int roll_no, String name, String course, float fees) {
        this(roll_no, name, course);//reusing the constructor.This must always be in the first line of constructor.otherwise error
        this.fees = fees;
    }

    void display() {
        System.out.println(roll_no + " " + name + " " + course + " " + fees);
    }
}

class TestThis{
    public static void main(String[] args) {
        Student s1=new Student(111,"Navaneetha Krishnan","JAVA");
        Student s2=new Student(112,"Sanjith","JAVA",405000f);
        s1.display();
        s2.display();
    }
}