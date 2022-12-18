public class Student3_2 {
    int id;
    String name;
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        Student3_2 s1 = new Student3_2();
        Student3_2 s2 = new Student3_2();

        s1.display();
        s2.display();
    }
}
