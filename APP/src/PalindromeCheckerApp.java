/*
================================================================================================================
MAIN CLASS - UseCase3PalindromeApp
================================================================================================================

Use Case 3: Reverse a String

Description:
This class represents basic palindrome validation by reversing a string and checking if it's
palindrome


The goal is to find if a Hardcoded string is Palindrome or not.

@author 1346-pranav-io
@version 2.0
 */

public class PalindromeCheckerApp
{
    public static void main(String args[])
    {
        System.out.println("Welcome to The Palindrome Checker");
        String txt = "123321";
        String rev = new StringBuilder(txt).reverse().toString();
        System.out.println("The Original String : "+txt);
        System.out.println("The Reversed String : "+txt);
        if(txt.equals(rev))
            System.out.println("The String "+txt+" is a Palindrome");
        else
            System.out.println("The String "+txt+" is Not a Palindrome");
    }
}