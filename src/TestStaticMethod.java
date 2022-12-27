class Student_M{
    int rollno;
    String name;
    static String college = "ITS";
    static void change(){
        college = "BBDIT";
    }

    Student(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){System.out.println(rollno +" "+ name + " " + college);}
}


public class TestStaticMethod {
    public static void main(String args[]){
        Student_M.change();

        Student_M s1 = new Student_M();
        Student_M s2 = new Student_M();
        Student_M s3 = new Student_M();

        s1.display();
        s2.display();
        s3.display();
    }
}
