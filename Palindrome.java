import  java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int numIn = input.nextInt();

        String reversed = "";
        String num = Integer.toString(numIn);

        for (int i = num.length() - 1; i >= 0; i--) {
            reversed += num.charAt(i);
        }

        if(num.equals(reversed)){
            System.out.println(num + " is palindromic");
        }else{
            System.out.println(num + " is not palindromic");
        }
    } 

}