//Assignment 2
//Name: 鄒翔宇
//ID: 109403019
//Course: 2023-CE1002

package A2_109403019;

import java.util.Scanner;

public class A2_109403019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next().toLowerCase();

        checkPalindromeStatus(input);

        sc.close();
    }


    public static void checkPalindromeStatus(String str) {

        int length = str.length();
        int left = 0, right = length - 1;
        int countWordRemoved = 0;

        while (left <= right) {

            if (str.charAt(left) != str.charAt(right)) {
                // The string is not a palindrome and cannot become a palindrome even removing one word.
                if (countWordRemoved == 1) {
                    System.out.println("No");
                    return;
                }

                // One word removed
                if (countWordRemoved == 0) {
                    if (str.charAt(left + 1) == str.charAt(right))
                        left++; // neglect left word.
                    else
                        right--; // neglect right word;


                    countWordRemoved++;

                    continue; // continue to next loop round
                }
            }


            // Iteration
            left++;
            right--;
        }

        if (countWordRemoved == 1) {
            System.out.println("Yes if a word is deleted");
        } else {
            System.out.println("Yes");
        }

    }
}
