public class Functions {
    public static void _Functions(){
        //Do Something here
    }

    //Arguments start from below
    public void bar(int num1, int num2){
        int a = 3;
        int b = 5;
        bar(a,b);

        //int num1 = a;
        //int num2 = b;
    }
    /*public static void bar2(Student s1, Student s2){
        Student joe = new Student("joe");
        Student jack = new Student("jack");
        bar2(joe, jack);

        s1.setName("Chuck"); //joe name is now Chuck as well
        s1 = new Student("Norris"); //s1 is a new student, different than joe with the name of Norris
        // s1 == joe is not true anymore.
    }*//*
    public void NonStaticMethods(){
       private String name;
       public String getName(){
        return name;
       } 
       public void setName(String name){
        this.name = name;
       }
       Student s = new Student();
       s.setName("Danielle");
       String name = s.getName();

       Student.setName("Bob"); //Will not work!
       Student.getName(); //Will not work!
    }*/
}
