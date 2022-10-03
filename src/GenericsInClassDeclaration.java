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
    public void testBob(){
        YourClass<String, Integer> leBobs = new YourClass<>("Words",42); // in this case, <> is the same as putting <String, Integer>
        String a = leBobs.getBob1();
        int b = leBobs.getBob2();
        System.out.println("bob1 is '" + a + "', and bob2 is '" + b + "'.");
    }
}
