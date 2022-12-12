
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class PatikaDevArraySorted {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the Array length :");
        int input =scan.nextInt();
        System.out.println("Enter the Value of Array :");
        int[] array=new int[input];
        for(int i=0;i<array.length;i++){
            System.out.print((i+1)+". Enter the index value of array :");
           array[i]=scan.nextInt();
             
        }
       Arrays.sort(array);
        System.out.println("From small to big :"+Arrays.toString(array));
        
            
        
    }
}
