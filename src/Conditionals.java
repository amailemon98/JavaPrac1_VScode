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
    public static void ifElse(){
        int a = 10;
        int b = 10;
        if (a==b){
            // a and b are equal, let's do something cool
        }
        if (a == b){
            //we already know this part
        }else{
            // a and b are not equal... :/
        }
        if (a==b)
            System.out.println("Another line Wow!");
        else
            System.out.println("Double rainbow!");
    }
    public static void theUglySideOfIt(){
        int a =4;
        //int result = a == 4 ? 1 : 8;

        // result will be 1
        // This is equivalent to
        int result;

        if (a==4){
            result = 1;
        }else{
            result = 8;
        }
    }
    public static void andEquals(){
        String a = new String("Wow");
        String b = new String("Wow");
        String sameA = a;

        boolean r1 = a ==b;     //This is false, since a and b are not the same object
        boolean r2 = a.equals(b); //This is true, since a and b are logically equals
        boolean r3 = a == sameA;  //This is true, sins a and sameA are really the same object
    }
}