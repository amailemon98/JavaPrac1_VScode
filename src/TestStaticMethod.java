class Student_M{
    int rollno;
    String name;
    static String college = "ITS";
    static void change(){
        college = "BBDIT";
    }

    Student_M(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){System.out.println(rollno +" "+ name + " " + college);}
}


public class TestStaticMethod {
    public static void main(String args[]){
        Student_M.change();

        Student_M s1 = new Student_M(111,"Karen");
        Student_M s2 = new Student_M(222,"Aryan");
        Student_M s3 = new Student_M(333,"Sonoo");

        s1.display();
        s2.display();
        s3.display();
    }
}
