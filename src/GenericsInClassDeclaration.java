public class GenericsInClassDeclaration<Class1, Class2> {
    private Class bob1;
    private Class bob2;
    Abc(Class1 a, Class2 b){
        this.bob1 = a;
        this.bob2 = b;
    }
    public Class1 getBob1(){
        return (this.bob1);
    }
    public Class2 getBob2(){
        return (this.bob2);
    }
}
