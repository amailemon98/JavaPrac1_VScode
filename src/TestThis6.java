class A{
    A(){System.out.println("hello a");}
    A(int x){
        this();
        System.out.println(x);
    }
}

public class TestThis6 {
    public static void main(String args[]){
        A a = new A(10);
    }
}
