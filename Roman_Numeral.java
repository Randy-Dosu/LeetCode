/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
 */
import java.util.Scanner;
public class Roman_Numeral{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter roman numeral: ");
        String numeral = input.next().toUpperCase();

        int num = 0;
        char[] rom = numeral.toCharArray();
        
         for (int j = 0; j < rom.length; j++) {
            boolean hasNext = j + 1 < rom.length;

            switch (rom[j]) {
                case 'I':
                    if (hasNext && (rom[j + 1] == 'V' || rom[j + 1] == 'X')) {
                        num -= 1;
                    } else {
                        num += 1;
                    }
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    if (hasNext && (rom[j + 1] == 'L' || rom[j + 1] == 'C')) {
                        num -= 10;
                    } else {
                        num += 10;
                    }
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    if (hasNext && (rom[j + 1] == 'D' || rom[j + 1] == 'M')) {
                        num -= 100;
                    } else {
                        num += 100;
                    }
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
                default:
                    System.out.println("Invalid Roman numeral: " + rom[j]);
                    return;
            }
        }
        System.out.println(numeral + " : " + num);
    }
}