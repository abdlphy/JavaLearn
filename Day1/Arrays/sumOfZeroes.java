package JavaLearn.Day1.Arrays;
import java.util.*;

/**
 * 1.sumOfZeroes
 */
public class sumOfZeroes {
    public static boolean sumOfZeroes(int arr[]){
        Set<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;
        for(int items:arr){
            sum+=items;
            if(sum == 0){
                System.out.println("Exists");
                return true;
            }
            set.add(sum);
        }

        System.out.println("Not Exists");
        return false;
    }
    public static void main(String[] args) {
        int arr[] = { 4, 6, 3, -13, 4, 2, 7 };
        sumOfZeroes(arr);
    }
    
}