public class Student4_2 {
    int id;
    String name;
    Student4_2(int i,String n){
        id = i;
        name = n;
    }
    void display(){System.out.println(id + " " + name);}

    public static void main(String args[]){
        Student4_2 s1 = new Student4_2(111, "Karan");
        Student4_2 s2 = new Student4_2(222, "Aryan");
        s1.display();
        s2.display();
    }
}
