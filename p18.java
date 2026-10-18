class Student {
    int rollNo;
    String name;

    void setData(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class p18 {
    public static void main(String[] args) {

        Student s = new Student();

        s.setData(101, "Rahul");
        s.display();
    }
}