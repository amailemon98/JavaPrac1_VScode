//import java.util.Arrays;
//import java.util.Scanner;
import java.util.*;
public class StairSorting
{
	public static void main(String[] args)
	{
				int[] arr = new int[3];
				int size = arr.length;
				
				Scanner scan = new Scanner(System.in);
				
				for(int i = 0; i<size;i++) {
					arr[i] = scan.nextInt();
				}
				
				Arrays.sort(arr);
				
				for(int i = 0; i<size; i++) {
					System.out.print(arr[i]+" ");
				}
		    
		
	}
}
