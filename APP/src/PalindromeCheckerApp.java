public class PalindromeCheckerApp
{
    public static void main(String args[])
    {
        System.out.println("Welcome to The Palindrome Checker");
        String txt = "123321";
        char str[] = txt.toCharArray();
        int n = str.length;
        int m = n-1;
        int c = 0;
        for(int i = 0; i<n; i++)
        {
            if(str[i]==str[m])
                c++;
            m--;
        }
        if(c==n)
            System.out.println("The String "+txt+" is a Palindrome");
        else
            System.out.println("The String "+txt+" is Not a Palindrome");
    }
}