import java.util.Stack;

public class PalindromeCheckerApp
{
    public static void main(String args[])
    {
        System.out.println("Version: 5.0");
        String txt = "123321";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < txt.length(); i++)
        {
            stack.push(txt.charAt(i));
        }

        String reversed = "";

        while(!stack.isEmpty())
        {
            reversed = reversed + stack.pop();
        }

        System.out.println("Original String: " + txt);
        System.out.println("Reversed String: " + reversed);

        if(txt.equals(reversed))
            System.out.println("The String " + txt + " is a Palindrome");
        else
            System.out.println("The String " + txt + " is Not a Palindrome");
    }
}