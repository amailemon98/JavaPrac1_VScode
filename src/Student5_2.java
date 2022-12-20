public class Student5_2 {
    int id;
    String name;
    int age;

    Student5_2(int i, String n){
        id =i;
        name =n;
    }

    Student5_2(int i, String n, int a){
        id = i;
        name = n;
        age =a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}

    public static void main(String args[]){
        Student5_2 s1 = new Student5_2(111, "Karan");
        Student5_2 s2 = new Student5_2(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
