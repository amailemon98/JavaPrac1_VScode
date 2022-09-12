public class Conditionals{
    public static void Condi(){
        int a = 4;
        boolean b = a ==4;

        if(b){
            System.out.println("It's true");
        }
    }
    public static void Condi2(){
        int a = 4;
        
        if (a == 4){
            System.out.println("Ohhh! S a is 4!");
        }
    }
    public static void booleanOperators(){
        int a = 4;
        int b = 5;
        boolean result;
        result = a < b; //true
        result = a > b; //false
        result = a <= 4; // a smaller or equal to 4 - true
        result = b >= 6; // a bigger or equal to 6 - false
        result = a == b; // a equal to b - false
        result = a != 6; // a is not equal to 6 - false
        result = a > b || a < b; // Logical or - true
        result = 3 < a && a < 6; // Logical and - true
        result = !result; // Logical not - false
    }
}