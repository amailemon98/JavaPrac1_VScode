public class Arrays {
    public static void arr(){
        int[] arr;
        arr = new int[10];
        System.out.println(arr.length);

        arr[0] = 4;
        arr[1] = arr[0] + 5;
    }
    public static void arr2(){
        int[] arr = new int[5];
        //accesses and sets the first element.
        arr[0] = 4;
        
        int[] arr2 = {1,2,3,4,5};

        for(int i = 0; i<arr2.length; i++){
            System.out.println(arr[i]);
        }
    }
}
