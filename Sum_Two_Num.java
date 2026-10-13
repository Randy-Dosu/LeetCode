package Leetcode;
import java.util.Scanner;
public class Sum_Two_Num{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int size = reader.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter targeted number");
        int target = reader.nextInt();
        
        for(int i = 0; i < size; i++){
            System.out.println("Enter number for index " + i + " :");
            nums[i] = reader.nextInt();
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    System.out.println("Output: ["+ i + ","+ j + "]");
                    return;
                }
            }
        }  
    }
}