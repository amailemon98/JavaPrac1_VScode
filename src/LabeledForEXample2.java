public class LabeledForEXample2 {
    public static void main(String[] args){
        aa:
            for(int j = 1;j<=3;j++){
                bb:
                for(int j =1;j<=3;j++){
                    if(i==2&&j==2){
                        break bb;
                    }
                    System.out.println(i+" "+j);
                }
            }
    }
}
