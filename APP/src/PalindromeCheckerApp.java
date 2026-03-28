/*
================================================================================================================
MAIN CLASS - UseCase9RecursionPalindromeApp
================================================================================================================

Use Case 9: Palindrome Validation using Recursion

Description:
This class demonstrates palindrome validation using
Recursion with a Hardcoded String.

At this stage, the application:
- Starts execution from the main method
- Displays a welcome message
- Shows application Version
- Stores a Hardcoded String
- Uses a recursive method to compare characters from start and end
- Applies a base condition to terminate recursion
- Utilizes Call Stack to manage recursive calls
- Prints whether the String is Palindrome or Not

Key Concepts:
Recursion – A technique where a method calls itself to solve smaller subproblems.
Base Condition – Prevents infinite recursion and terminates the recursive calls.
Call Stack – Memory structure used to manage method calls during recursion.
Logical Comparison – Matching first and last characters progressively.

Data Structure Used: Call Stack

@author 1346-pranav-io
@version 9.0
================================================================================================================
*/

public class PalindromeCheckerApp
{
    public static void main(String args[])
    {
        System.out.println("Welcome to The Palindrome Checker");
        String txt = "123321";

        boolean isPalindrome = checkPalindrome(txt, 0, txt.length() - 1);

        if(isPalindrome)
            System.out.println("The String " + txt + " is a Palindrome");
        else
            System.out.println("The String " + txt + " is Not a Palindrome");
    }

    public static boolean checkPalindrome(String txt, int start, int end)
    {
        if(start >= end)
            return true;

        if(txt.charAt(start) != txt.charAt(end))
            return false;

        return checkPalindrome(txt, start + 1, end - 1);
    }
}