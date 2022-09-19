public class Loops {
    public static void _For(){
        //The for loop has three sections.
        //for(1. (int i = 0;) 2. (i < 3;) 3. (i++)){
        //
        //}
        //int i = 0;
        //i < 3     0 < 3 = true
        //          Inside of loop
        //i++       i is now 1
        //i < 3     1 < 3 = true
        //          Inside of loop
        //i ++      i is now 2
        //i < 3     2 < 3 = true
        //          Inside of loop
        //i++       i is now 3
        //i < 3     3 < 3 = false
        //          Loop is done...
        //for(;i<5;){} //you can omit the first and third section of the loop
    }
    public static void _While(){
        //while(condition){}

        //do{
        //}    while(condition);

    }
    public static void _Foreach(){
        
        int[] arr = {2, 0, 1, 3};
        for (int el : arr) {
            System.out.println(el);
        }
    }// This is short version and equivalent to:
    public static void _Foreach2(){
        
        int[] arr = {1, 9, 9, 5};
        for(int i = 0; i < arr.length; i++){
            int el = arr[i];
            System.out.println(el);
        }
    }
    public static void _Break(){
        int i;
        for (i = 0; i< 5; i++){
            if(i>=2){
                break;
            }
            System.out.println("Yuhu");
        }
        System.out.println(i);
    }
    public static void _Continue(){
        int i;
        for(i = 0; i < 5; i++){
            if (i >= 3){
                break;
            }
            System.out.println("Yuhu");
            if (i >= 1){
                continue;
            }
            System.out.println("Tata");
        }
        System.out.println(i);
    }
}
